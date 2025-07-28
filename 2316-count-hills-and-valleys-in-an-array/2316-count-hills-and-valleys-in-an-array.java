class Solution {
    public int countHillValley(int[] nums) {
        if(nums == null || nums.length < 3)return 0 ; 
        int count = 0 ; 
        int left = nums[0];
        for(int i =1  ; i < nums.length -1 ; i++){
            if(nums[i] == nums[i+1])continue ; 
            if(nums[i] > left && nums[i] > nums[i+1])count++ ; 
            if(nums[i] < left && nums[i] < nums[i+1])count++ ; 
            left = nums[i];
        }
        return count ; 
    }
}