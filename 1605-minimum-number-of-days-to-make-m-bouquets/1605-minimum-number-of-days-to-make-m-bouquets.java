class Solution {
    public int minDays(int[] bloom, int m, int k) {
        int n = bloom.length , low = Arrays.stream(bloom).min().getAsInt() ; 
        int high = Arrays.stream(bloom).max().getAsInt() , ans = - 1;
        if( n < m*k )return -1 ; 
        while(low <= high){
            int mid = (high+low) / 2 ;
            int check = helper(bloom,mid,k); 

            if(check >= m){
                ans = mid ; 
                high = mid -1 ; 
            }else{
                low = mid + 1 ; 
            }
        }

        return ans ; 
    }

    public int helper(int[]bloom , int day, int k){
        int count = 0 , sum = 0 ; 
        for(int n : bloom){
            if(n <= day){
                count++ ; 
            }else{
                sum += count/k ; 
                count = 0 ;
            }
        }
        sum += count/ k  ; 
      
        return sum ; 
    }
}