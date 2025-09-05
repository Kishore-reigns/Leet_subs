class Solution {
    public int wiggleMaxLength(int[] nums) {
        int up = 1 , down = 1 ; 
        boolean pos = true ; 
        for(int r = 1 ; r < nums.length ; r++){
            
            if(nums[r] > nums[r-1])up = down+1 ; 
            else if(nums[r] < nums[r-1])down = up+1 ; 
            
        }

        return Math.max(up,down);
    }
}