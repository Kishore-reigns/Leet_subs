class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length ; 
        int[][] dp = new int[n][2] ;
        return helper(0,nums,n,0,target);
    }

    public int helper(int i , int[] nums ,int n, int sum , int target){

        if(i == n){
            if(sum == target)return 1 ;
            return 0 ; 
        }

        int plus = helper(i+1,nums,n,nums[i]+sum,target);
        int diff = helper(i+1,nums,n,0-nums[i]+sum,target);

        return plus+diff ; 
    }
}