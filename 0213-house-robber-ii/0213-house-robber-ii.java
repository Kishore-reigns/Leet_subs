class Solution {
    public int rob(int[] nums) {
        int n = nums.length ; 
        if(n == 1)return nums[0];
        if(n == 2)return Math.max(nums[0],nums[1]);
        int[] dp1 = new int[n] ; 
        int[] dp2 = new int[n] ; 
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max( dfs(0,n-2,nums,dp1) , dfs(1,n-1,nums,dp2));
    }

    public int dfs(int i , int n  , int[] nums , int[] dp){
        if(i > n)return 0 ; 
        if(dp[i]!=-1)return dp[i] ; 
        return dp[i] = Math.max( nums[i]+dfs(i+2,n,nums,dp) , dfs(i+1,n,nums,dp)) ;
    }
}