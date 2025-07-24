class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum = 0 , costsum = 0 , n = gas.length , total = 0 , index = 0 ; 
        int[] diff = new int[n];
        for(int v : gas)gassum += v ; 
        for(int v : cost)costsum += v ; 
        if(gassum < costsum)return -1 ; 
    
       
        for(int i= 0 ; i < n ; i++){
            total += (gas[i] - cost[i]); 
            if(total < 0){
                total = 0 ; 
                index = i + 1 ; 
            }
        }
        return index ; 
    }
}