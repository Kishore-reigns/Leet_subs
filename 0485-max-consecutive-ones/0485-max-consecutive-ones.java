class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , maxi = -1 ;

        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == 0){
                maxi = Math.max(maxi,count);
                count = 0 ; 
            }else{
                count++ ; 
            }

        }
         maxi = Math.max(maxi,count);

        return maxi ; 

    }
}