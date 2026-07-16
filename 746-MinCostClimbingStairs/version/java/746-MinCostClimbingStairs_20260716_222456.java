// Last updated: 7/16/2026, 10:24:56 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n = cost.length;
4        int[] dp = new int[n];
5
6        dp[0] = cost[0];
7        dp[1] = cost[1];
8
9        for (int i = 2; i < n; i++) {
10            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
11        }
12
13        return Math.min(dp[n - 1], dp[n - 2]);
14    }
15}