class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int count = 0 , l = 0 , r = 0 , n = arr.length; 
        if(n < 3)return false ; 

        while( r < 3){
            if(arr[r++]%2 != 0)count++ ;
        }
        if(count == 3)return true ; 

        while( r < n ){
            if(arr[r++]%2 != 0)count++ ; 
            if(arr[l++]%2 != 0)count-- ;
            if(count==3)return true ; 

        }
        return false ; 
    }
}