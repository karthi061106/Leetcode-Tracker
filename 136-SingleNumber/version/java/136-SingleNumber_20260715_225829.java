// Last updated: 7/15/2026, 10:58:29 PM
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int l = columnTitle.length();
4        int pow = 1;
5        int ans = 0;
6        
7        
8        for (int i = l - 1; i >= 0; i--) {
9            char letter = columnTitle.charAt(i);
10            int ascii = (int) letter;
11            int val = ascii - 64;
12            ans += val * pow;
13            pow *= 26;
14        }
15        
16        
17        return ans;
18    }
19}