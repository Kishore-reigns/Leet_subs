class Solution {
    public int rob(int[] nums) {
        int n = nums.length ; 
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return dfs(0,nums,n,dp);
    }

    public int dfs(int i, int[] nums, int n , int[] dp){
        if( i >= n)return 0 ; 

        if(dp[i]!=-1)return dp[i];

        int select = nums[i] + dfs(i+2,nums,n,dp);
        int notselect = dfs(i+1,nums,n,dp);

        return dp[i] = Math.max(select,notselect);
    }
}