class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length ; 
        int dp[][] = new int[n+1][amount+1];
        for(int[] a : dp)Arrays.fill(a,-1);
        return ways(0,amount,coins,n,dp);
    }

    public int ways(int i , int amount, int[] coins, int n , int[][]dp){
        if(amount == 0)return 1 ; 
        if( i == n )return 0 ; 

        if(dp[i][amount] != -1)return dp[i][amount];

        int pick = 0 ; 
        if(amount-coins[i] >= 0){
            pick = ways(i,amount-coins[i],coins,n,dp);
        }
        int notpick = ways(i+1,amount,coins,n,dp);

        return dp[i][amount] = pick + notpick ; 
        
    }
}