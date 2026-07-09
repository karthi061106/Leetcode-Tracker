// Last updated: 7/9/2026, 3:07:05 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int xOr =x^y;
        int count=0;
        while(xOr!=0){
            xOr=(xOr&(xOr-1));
            count++;

        }
        return count;
        
        
    }
}