class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length ;
        Boolean[]dp  = new Boolean[n+1] ; 
        return helper(0,nums,n,dp);
    }

    public boolean helper(int i , int[] nums , int n , Boolean[] dp){

        if(i == n-1)return true ; 
        if( i >= n )return false ; 

        if(dp[i] != null)return dp[i] ;

        // int furthest = Math.min(i + nums[i], n - 1);

        for(int j = 1 ; j <= nums[i] ; j++){
            if(helper(i+j,nums,n,dp) == true)return dp[i] =  true ; 
        }

        return dp[i] = false ; 
        
    }
}