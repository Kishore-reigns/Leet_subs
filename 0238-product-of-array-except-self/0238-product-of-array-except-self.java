class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ; 
        int[] prefix = new int[n+2] ;
        int[] suffix = new int[n+2] ; 
        int[] ans = new int[n] ; 
        Arrays.fill(prefix,1) ; Arrays.fill(suffix,1);
        for(int i = 1 ; i < n+1 ; i++){
            prefix[i] = nums[i-1] * prefix[i-1] ; 
        }  
        for(int i = n ; i >= 1 ; i--){
            suffix[i] = nums[i-1] * suffix[i+1] ;
        }
        for(int i = 1 ; i <= n ; i++){
            ans[i-1] = prefix[i-1] * suffix[i+1] ; 
        }

        return ans ; 
    }
}