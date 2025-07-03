class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1 , n = nums.length , res = Integer.MIN_VALUE; 
        int[] prefix = new int[n] ; 
        int[] suffix = new int[n] ; 
        for(int i = 0 ; i < n ; i++){
          prod = prod* nums[i] ; 
          prefix[i] = prod  ; 
          if(nums[i] == 0){
            prod = 1 ; 
          }
        }
        prod = 1 ; 
        for(int i = n-1 ; i >= 0  ; i--){
          prod = prod * nums[i] ; 
          suffix[i] = prod  ; 
          if(nums[i] == 0){
            prod = 1 ; 
          }
        }

        for(int i = 0 ; i < n ; i++){
            res = Math.max(res, Math.max(prefix[i],suffix[i]));
        }
        return res ; 
    }
}