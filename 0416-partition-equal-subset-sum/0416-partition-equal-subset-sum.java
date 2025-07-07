class Solution {
    Boolean[][] dp ; 
    public boolean canPartition(int[] nums) {
        int total = 0 ;
 
        for(int n : nums)total += n ;
        if(total%2 != 0)return false ; 
        int n = nums.length ; 
        dp = new Boolean[n+1][total+1];
      
        return isParti(0,nums,n,total,0); 
    }

    public boolean isParti(int i , int[] nums, int n , int total,int sum){
        if(i >= n)return false ; 
        if(sum > total)return false ; 
        if(total == sum)return true ; 

        if(dp[i][total] != null)return dp[i][total] ; 

        
        // pick 
        boolean pick = isParti(i+1, nums, n , total-nums[i], sum+nums[i]);
        //not pick 
        boolean notpick = isParti(i+1,nums,n,total,sum);

        boolean res = pick || notpick ; 
      
        return dp[i][total] = res ; 
    }
}