// Last updated: 8/9/2026, 11:59:46 PM
1class Solution {
2    private int solve(int[] nums, int curr_i, int prev_i, int[][] dp) {
3        if (curr_i == nums.length)
4            return 0;
5
6        if (dp[curr_i][prev_i] != -1)
7            return dp[curr_i][prev_i];
8
9        int take = 0;
10        if (prev_i == nums.length || nums[prev_i] < nums[curr_i])
11            take = 1 + solve(nums, curr_i + 1, curr_i, dp);
12
13        int skip = solve(nums, curr_i + 1, prev_i, dp);
14
15        return dp[curr_i][prev_i] = Math.max(take, skip);
16    }
17
18    public int lengthOfLIS(int[] nums) {
19        int n = nums.length;
20        int[][] dp = new int[n + 1][n + 1];
21
22        for (int i = 0; i < n + 1; i++)
23            Arrays.fill(dp[i], -1);
24
25        return solve(nums, 0, n, dp);
26    }
27}