// Last updated: 7/9/2026, 3:05:15 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int t=Math.min(k,Math.max(0,mul-1));
        int idx=nums.length-1;
        for(int i=0;i<t;i++){
            ans+=1L *nums[idx--]*(mul-i);
        }
        for(int i=t;i<k;i++){
            ans+=nums[idx--];
        }
        return ans;
    }
}