class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length ; 
        int dp[] = new int[amount+1];
        Arrays.fill(dp,-1);
        int res = check(amount,coins,n,dp);
        return (res == Integer.MAX_VALUE)? -1 : res ; 
    }

    public int check(int amount , int[] coins ,int n, int[] dp){
       
        if(amount == 0)return 0 ; 
        if(dp[amount] != -1)return dp[amount];

        int res = Integer.MAX_VALUE  ; 
        for(int j = 0 ; j < n ; j++){
            if(amount - coins[j] >= 0){
                  int pick = check(amount-coins[j],coins,n,dp);
                  if(pick!=Integer.MAX_VALUE)res = Math.min(res,pick+1);
            }
            
        }
        return dp[amount] = res ; 
    }

    
}