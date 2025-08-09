class Solution {
    public int countTriplets(int[] arr) {
        int count = 0 ; 
        int n = arr.length ; 
        int left = 0 , right = 0; 
        for(int i = 0 ; i < n-1 ; i++){
             int cur = 0 ;
            for(int k = i;  k < n ; k++){
                cur ^= arr[k];
                if( cur == 0 )count += (k-i );
            }
         
        }
        return count ;    
    }
}