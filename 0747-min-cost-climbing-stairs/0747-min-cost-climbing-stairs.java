class Solution {
      int[] dp ;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length , one = 1_000_000_007; 
        dp = new int[n+1];
        Arrays.fill(dp,-1);
 
      
        return Math.min(  mini(0,cost,n),  mini(1,cost,n));
    }

    public int mini(int i , int[] cost, int n ){
        if(i >= n)return 0 ; 

        if(dp[i]!=-1)return dp[i];

        dp[i] = cost[i] + Math.min(mini(i+1,cost,n),mini(i+2,cost,n));
     
        return dp[i]  ; 
    }
}