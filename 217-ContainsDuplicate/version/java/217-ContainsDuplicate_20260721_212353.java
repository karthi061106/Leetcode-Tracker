// Last updated: 7/21/2026, 9:23:53 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] == nums[i - 1]) {
7                return true;
8            }
9        }
10        
11        return false;        
12    }
13}