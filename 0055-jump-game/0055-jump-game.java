class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length ; 
        if(n == 1)return true ;  
        boolean dp[] = new boolean[n];
        dp[n-1] = true ; 
        if( nums[n-2] > 0) dp[n-2] = true ; 
        for(int i = n-3 ; i >= 0 ; i--){
            for(int j = 1 ; j <= nums[i] ; j++){
                if(i+j < n && dp[i+j])dp[i] = true ; 
            }
        }

        return dp[0];
    }
}