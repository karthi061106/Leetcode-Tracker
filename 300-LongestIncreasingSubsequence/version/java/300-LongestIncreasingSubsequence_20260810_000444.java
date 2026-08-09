// Last updated: 8/10/2026, 12:04:44 AM
1class Solution {
2    public int maxCoins(int[] nums) {
3        int[] dummy_num = new int[nums.length + 2];
4        dummy_num[0] = dummy_num[dummy_num.length - 1] = 1;
5        for(int i = 1;i <= nums.length;i ++)
6            dummy_num[i] = nums[i - 1];
7        int[][] dp = new int[dummy_num.length][dummy_num.length];
8        for (int i = dummy_num.length - 3; i >= 0; i --) {
9            for (int j = i + 2; j < dummy_num.length;j ++) {
10                for (int k = i + 1; k < j; k ++)
11                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + dummy_num[i] * dummy_num[k] * dummy_num[j]);
12            }
13        }
14        return dp[0][dummy_num.length - 1];
15    }
16}