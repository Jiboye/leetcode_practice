import java.io.*;

class Solution{
    public int canCompleteCurcuit(int[] gas,int[]cost){
        int n = gas.length();
        int ans = 0;
        int sumcost = 0;
        int sumgas = 0;
        for(int i = 0; i < n;i++){
            sumgas += gas[i];       //count all gas in gas station
            sumcost += cost[i];     //count all gas need to complete the curcuit
        }
        if(sumcost > sumgas)
            return -1;      // if gas less than cost, return can't complete
        int tmp = 0;
        for(int i=0;i<n;i++){
            if(tmp < 0){    //if current gas station's gas can't go to next station
                tmp = 0;
                ans = i;    //reset start point
            }
            tmp += (gas[i] - cost[i]);
        }
        return ans;
    }
}
