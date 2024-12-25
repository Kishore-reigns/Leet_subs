class Solution {
    public int search(int[] nums, int target) {
        int mid = 0 , high = nums.length - 1 , low = 0 ; 
        while(low <= high){
            mid = (high + low) / 2 ; 

            if(nums[mid] == target)return mid ; 
            if( nums[low] <= nums[mid]){
                if(nums[low] <= target &&  target < nums[mid] )high = mid-1 ; 
                else low = mid + 1 ; 
            }else{
                if(nums[high] >= target && nums[mid] < target )low = mid+1 ;
                else high = mid -1 ; 
            }
        }
        return -1 ; 
    }
}