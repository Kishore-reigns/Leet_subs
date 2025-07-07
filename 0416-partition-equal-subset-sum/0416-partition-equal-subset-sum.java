class Solution {
    int[][] dp ; 
    public boolean canPartition(int[] nums) {
        int total = 0 ;
 
        for(int n : nums)total += n ;
        int n = nums.length ; 
        dp = new int[n+1][total+1];
        for(int[] a : dp)Arrays.fill(a,-1);
        return isParti(0,nums,n,total,0); 
    }

    public boolean isParti(int i , int[] nums, int n , int total,int sum){
        if(i >= n)return false ; 
        if(sum > total)return false ; 
        if(total == sum)return true ; 

        if(dp[i][total] != -1){
            if(dp[i][total] == 1)return true ; 
            return false ; 
        }
        // pick 
        boolean pick = isParti(i+1, nums, n , total-nums[i], sum+nums[i]);
        //not pick 
        boolean notpick = isParti(i+1,nums,n,total,sum);

        boolean res = pick || notpick ; 
        if(res == true )dp[i][total] = 1 ; 
        else dp[i][total] = 0 ; 
        return res ;
    }
}