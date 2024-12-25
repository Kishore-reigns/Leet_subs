class Solution {
    public boolean search(int[] nums, int target) {
        int mid = 0 , low = 0 , high = nums.length -1 ; 

        while(low <= high){
            mid = (low+high) / 2 ; 
            if(nums[mid] == target)return true ; 

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++ ; 
                high-- ; 
            }

            else if(nums[low] <= nums[mid]){
                if( nums[low] <= target && target < nums[mid])high = mid -1 ; 
                else low = mid + 1 ; 
            }else{
                if(target > nums[mid] && target <= nums[high])low = mid + 1 ; 
                else high = mid -1 ;
            }
        }
        return false ; 
    }
}