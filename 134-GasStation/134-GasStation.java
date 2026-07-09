// Last updated: 7/9/2026, 3:08:15 PM
 class Solution{
 public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;

        int totalgas = 0, remaingas = 0, start = 0;
        

        for (int i = 0; i < n; i++) {
            totalgas +=gas[i]-cost[i];
            remaingas+= gas[i]-cost[i];
            if(remaingas<0){
                remaingas=0;
                start=i+1;
            }
        }
        return (totalgas<0)? -1: start;
     }
   }  