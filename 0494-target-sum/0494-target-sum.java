class Solution {
    private int[][] dp ;
    private int total ; 
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length ; 
        total = 0;
        for(int v : nums)total += v ; 
        dp = new int[n+1][(2*total)+1];

        for (int[] row : dp) Arrays.fill(row, Integer.MIN_VALUE);
        
        return ways(0,0,target,nums,n);
    }

    public int ways(int i,int sum,int target, int[] nums, int n){
        if(i == n){
            return (sum == target)? 1 : 0;
        }
        
        if(dp[i][sum+total] != Integer.MIN_VALUE)return dp[i][sum+total];

        int plus = ways(i+1,sum+nums[i],target,nums,n);
        int sub = ways(i+1,sum-nums[i],target,nums,n);
        return dp[i][sum+total] = plus + sub ; 


    }
}