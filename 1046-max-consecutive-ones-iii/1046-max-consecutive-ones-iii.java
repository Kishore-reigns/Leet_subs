class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length , maxi = -1 , left = 0 , right = 0  , c = 0 ;
        while( left < n){
            if(right < n && nums[right] == 1)right++ ; 
            else if(right < n && nums[right] == 0 && c < k){
                right++ ; 
                c++ ; 
            }else{
                if(nums[left] == 0)c-- ; 
                left++ ;
            }
            maxi = Math.max(maxi,right-left) ;
        }
        return maxi ; 
    }
}