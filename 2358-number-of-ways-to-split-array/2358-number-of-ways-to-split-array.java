class Solution {
    public int waysToSplitArray(int[] nums) {
        
        long tot = 0 ; 
        for(int n : nums)tot += n ; 
      
        long prefix = 0 ; int  count = 0 , n = nums.length;
        
        for(int i = 0 ; i < n-1 ; i++){
            prefix += nums[i] ;
            if(prefix >= tot - prefix)count++ ; 
        }
        return count ; 
      
       
    }
}