// Last updated: 8/22/2026, 4:11:56 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;        
    }
}