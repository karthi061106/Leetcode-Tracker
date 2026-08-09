// Last updated: 8/10/2026, 12:12:07 AM
1class Solution {
2    public int numDecodings(String s) {
3        if (s.charAt(0) == '0') {
4            return 0;
5        }
6
7        int n = s.length();
8        int[] dp = new int[n + 1];
9        dp[0] = dp[1] = 1;
10
11        for (int i = 2; i <= n; i++) {
12            int one = Character.getNumericValue(s.charAt(i - 1));
13            int two = Integer.parseInt(s.substring(i - 2, i));
14
15            if (1 <= one && one <= 9) {
16                dp[i] += dp[i - 1];
17            }
18            if (10 <= two && two <= 26) {
19                dp[i] += dp[i - 2];
20            }
21        }
22
23        return dp[n];        
24    }
25}