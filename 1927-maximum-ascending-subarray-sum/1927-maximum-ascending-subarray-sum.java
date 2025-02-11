class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxi = -1 , n = nums.length , sum = 0 ; 
        sum += nums[0] ; 
        maxi = Math.max(maxi,sum);
        for(int i = 1 ; i < n ; i++){
            if( nums[i] > nums[i-1])sum+= nums[i] ; 
            else{
                sum = nums[i] ; 
            }
             maxi = Math.max(maxi,sum);
        }

        return maxi ; 
    }
}