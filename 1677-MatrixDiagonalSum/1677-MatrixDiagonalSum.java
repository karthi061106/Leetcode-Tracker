// Last updated: 7/9/2026, 3:05:56 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int r=0;
        for(int i=0;i<n;i++){
            r+=mat[i][i] + mat[i][n-i-1];

        }
        if(n%2==1){
            r-=mat[n/2][n/2];
        }
        return r;


        
    }
}