class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0, coins, amount, dp);
    }

    public int helper(int i, int[] coins, int amount, int[][] dp) {
        if (i >= coins.length || amount < 0)
            return 0;
        if (amount == 0)
            return 1;

        if (dp[i][amount] != -1)
            return dp[i][amount];

        int pick = 0, notpick = 0;
        if ( amount - coins[i] >= 0) {
            pick += helper(i, coins, amount - coins[i], dp);
        }
        notpick += helper(i + 1, coins, amount, dp);

        return dp[i][amount] = pick + notpick;
    }
}