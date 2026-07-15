// Last updated: 7/15/2026, 9:19:13 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int res = 0;
4
5        for (int n : nums) {
6            res ^= n;
7        }
8
9        return res;        
10    }
11}