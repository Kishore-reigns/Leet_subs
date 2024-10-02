class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] freq = new int[k] ; 
        for(int x : arr){
            int rem = x%k ;
            if(rem < 0){
                rem += k ;
            }
           freq[rem]++ ; 
        }

    
        if(freq[0]%2 != 0)return false ; 
    
        for(int r = 1 ; r <= k/2 ; r++){
            if(freq[r] != freq[k-r])return false ; 
        }

          //if(map.getOrDefault(0,0)%2 != 0)return false ; 
        return true ; 

    }
}