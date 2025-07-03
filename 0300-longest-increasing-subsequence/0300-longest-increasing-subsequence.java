class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ; 
        int[] dp = new int [n] ;
        Arrays.fill(dp,-1);
        int res = 1 ; 
        for(int i = 0 ; i < n; i++){
            res = Math.max(res,check(i,nums,n, dp));
        }

        return res ;
    }

    public int check(int i , int[] nums , int n , int[] dp){
      

        if(dp[i]!=-1)return dp[i];

        int res = 1 ; 
        for(int j = i+1 ; j < n ; j++){
            if(nums[j] > nums[i]){
                res = Math.max(res,1 + check(j,nums,n,dp));
            }
        }

        return dp[i] = res ; 

    }
}