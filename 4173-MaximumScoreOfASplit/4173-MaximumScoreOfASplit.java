// Last updated: 7/9/2026, 3:05:13 PM
class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long[] suffixMin = new long[n];
        suffixMin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixMin[i]=Math.min(nums[i],suffixMin[i+1]);
        }
        long ps=0;
        long ms=Long.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            ps+=nums[i];
            long score=ps-suffixMin[i+1];
            ms=Math.max(ms,score);
        }
        return ms;
        
    }
}