class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length ; 
        int tank = 0 ; 
        int start = 0; 
        int totalgas = 0 , totalcost = 0 ; 
        for(int i = 0 ; i < n ; i++){
          
          totalgas += gas[i] ; 
          totalcost += cost[i] ; 
          tank += gas[i] - cost[i] ; 

          if( tank < 0){
            tank = 0 ; 
            start = i + 1  ; 
          }

        }

       
        return totalgas >= totalcost ? start : -1 ; 
          
            
      
    }

    /*
  start = i ; 
            boolean canComplete = true ; 
            tank = gas[start] ; 
            for(int j = 0 ; j < n ; j++){
                if(tank < cost[start]){
                    canComplete = false ; 
                    break ; 
                }
                tank -= cost[start] ;
                start = (start+1)%n ; 
                tank += gas[start];
            }
            if(canComplete)return i ; 


    */
}