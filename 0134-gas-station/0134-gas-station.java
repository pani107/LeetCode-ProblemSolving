class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = 0;
        int currF= 0;
        int s = 0;
        for(int i = 0; i< n; i++){
            int diff =gas[i] - cost[i];
            sum += diff;
            currF += diff;
            if(currF < 0){
                s = i+1;
                currF = 0;
            } 
        }
        return sum >= 0 ? s : -1; 
    }
}