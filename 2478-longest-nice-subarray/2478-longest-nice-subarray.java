class Solution {
    public int longestNiceSubarray(int[] nums) {
        int len = 1 ; 
        int l = 0 , used = 0 ; 
        for(int r = 0 ; r < nums.length ; r++){
            
            while((used&nums[r]) != 0){
                used ^= nums[l] ; 
                l++ ; 
            }
            used |= nums[r];
            len = Math.max(len,r-l+1);

        }

        return len ; 
    }
}