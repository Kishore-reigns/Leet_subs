class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length ; 
        int sum = 0 ; 
        for(int v : nums)sum+= v ; 
        int[][] dp = new int[n][2*sum+1] ;
        for(int i = 0 ; i < n ; i++)Arrays.fill(dp[i],-1);
        return helper(0,nums,n,0,target,dp,sum);
    }

    public int helper(int i , int[] nums ,int n, int sum , int target,int dp[][],int tot){

        if(i == n){
            if(sum == target)return 1 ;
            return 0 ; 
        }

        if(dp[i][sum+ tot]!= -1)return dp[i][sum + tot] ; 

        int plus = helper(i+1,nums,n,nums[i]+sum,target,dp,tot);
        int diff = helper(i+1,nums,n,0-nums[i]+sum,target,dp,tot);

        return dp[i][sum+tot] = plus+diff ; 
    }
}