class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0 , maxi = 0 , cur = 0 ; 
        for(int i = 0 ; i <= nums.length ; i++){
            if(i < nums.length && nums[i] == 1){
                cur += 1 ; 
            }else{
                if(prev+cur > maxi)maxi = prev+cur ; 
                prev = cur ; 
                cur = 0 ; 
            }
        }
        if(maxi == nums.length)return maxi-1 ; 
        return maxi ; 
    }
}