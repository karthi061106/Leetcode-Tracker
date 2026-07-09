// Last updated: 7/9/2026, 3:05:29 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d=(x-y)*(x+y-2*z);
        return (d!=0?1:0)<<(d>0?1:0);
       
            
        
        
    }
}