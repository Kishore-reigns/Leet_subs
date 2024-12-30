class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length , low = Arrays.stream(weights).max().getAsInt() , ans = -1 , sum = 0  ;
        for(int i : weights)sum+= i ; 
         int high = sum;

        while(low <= high){
            int cap = (low+high) / 2 ;
            int check = helper(weights,cap);

            if(check <= days){
                ans = cap ; 
                high = cap -1 ; 
            }else{
                low = cap + 1 ; 
            }
        }
        return ans ; 
    }

    public int helper(int[] w , int cap){
        int count = 0 , res = 1 ;  
        for(int n : w){ 
            if(count+n > cap){
                res++ ; 
                count = n ; 
                
            }else{
                count += n ; 
               // System.out.print(n+" ");
            }
        }

     
        System.out.println(cap + " " + res);
        return res ; 
    }
}