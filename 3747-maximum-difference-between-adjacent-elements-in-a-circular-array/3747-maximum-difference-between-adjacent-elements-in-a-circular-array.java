class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi = Integer.MIN_VALUE ;
        int n = nums.length ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(i==n-1){
                maxi = Math.max(maxi,Math.abs(nums[i]-nums[0]));
            }else{
                maxi = Math.max(maxi,Math.abs(nums[i]-nums[i+1]));
            }

        } 
        return maxi ; 
    }
}