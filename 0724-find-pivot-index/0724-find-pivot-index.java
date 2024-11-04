class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length , tot = 0 ; 
        for(int i = 0 ; i < n ; i++){
            tot += nums[i];
        }
        int left = 0 ; 
        for(int i = 0 ; i < n ;i++){
            if(left == tot - nums[i] - left ){
                return i ; 
            }
            left += nums[i] ; 
        }
        return -1 ; 
    }
}