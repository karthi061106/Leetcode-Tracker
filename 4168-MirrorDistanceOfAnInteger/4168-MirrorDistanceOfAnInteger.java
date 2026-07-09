// Last updated: 7/9/2026, 3:05:25 PM
class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int rev=0;
        while(n!=0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
        }
        return Math.abs(num-rev);      
    }
}