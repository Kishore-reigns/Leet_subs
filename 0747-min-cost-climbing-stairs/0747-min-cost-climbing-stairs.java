class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ; 
        int[] dp = new int[n+1] ;
        Arrays.fill(dp,-1); 
        return Math.min(check(0,cost,n,dp),check(1,cost,n,dp));
    }

    public int check(int i , int[] cost ,int n , int[] dp){
        if (i == n) return 0 ; 
        if(i > n) return Integer.MAX_VALUE/2 ; 
        if(dp[i]!= -1)return dp[i] ; 
        return dp[i] =  cost[i] + Math.min(check(i+1 , cost, n , dp) , check(i+2,cost,n,dp) );
    }
}