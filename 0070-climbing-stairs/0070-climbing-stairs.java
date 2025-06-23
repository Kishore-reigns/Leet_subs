class Solution {
    public int climbStairs(int n) {
       int dp[] = new int[n+1];
       Arrays.fill(dp,-1);
       return check(0,dp,n);
    }
    public int check(int i , int[] dp, int n ){
        if( i > n )return 0 ; 
        if( i == n )return 1 ; 
        if(dp[i]!=-1)return dp[i];
        return dp[i] = check(i+1,dp,n) + check(i+2,dp,n);
    }
}