// Last updated: 7/9/2026, 3:05:44 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        int rev =0;
        for(int n :nums){
            sum1+=n;
        
          while (n!=0){
            sum2+=n%10;
            n/=10;
          }
        }
        
        
        return Math.abs(sum1-sum2);


        
    }
}