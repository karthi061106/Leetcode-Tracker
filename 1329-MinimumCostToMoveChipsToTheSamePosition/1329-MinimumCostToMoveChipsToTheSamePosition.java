// Last updated: 7/9/2026, 3:06:11 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddCount=0;
        int evenCount=0;
        for(int n : position){
            if (n%2==0){
                evenCount++;
                
            }else{
                oddCount++;
                
            }


        }
        return oddCount>evenCount?evenCount:oddCount;


        
        
    }
}