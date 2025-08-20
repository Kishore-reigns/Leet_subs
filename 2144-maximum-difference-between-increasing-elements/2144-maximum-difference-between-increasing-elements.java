class Solution {
    public int maximumDifference(int[] nums) {
        int res = -1 ; 
        int n = nums.length ; 
        int i = 0 , j = 1 ; 
        for(j = 1 ; j < n ; j++){
            if(nums[j] > nums[i]){
                res = Math.max(res,nums[j]-nums[i]);   
            }else i = j ; 

            
        }

        return res ; 
    }
}