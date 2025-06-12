class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi = Integer.MIN_VALUE ;
        int n = nums.length ; 
        maxi = Math.max(maxi,Math.abs(nums[n-1]-nums[0]));
        for(int i = 0 ; i < nums.length-1 ; i++){
            maxi = Math.max(maxi,Math.abs(nums[i]-nums[i+1]));
            

        } 
        return maxi ; 
    }
}