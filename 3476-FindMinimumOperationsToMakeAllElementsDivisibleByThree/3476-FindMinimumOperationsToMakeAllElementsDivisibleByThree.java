// Last updated: 7/9/2026, 3:05:32 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int x:nums){
            if(x%3!=0){
                count++;
            }
            
        }
        return count;
        
    }
}