class Solution {
    public int search(int[] nums, int target) {
        int left = 0  , right = nums.length-1 ; 

        while(left <= right){
            int mid = (left + right) / 2 ; 
            int num = nums[mid];

            if(num == target)return mid ; 

            if(nums[left] <= num){
                if(nums[left] <= target && target < num)right = mid - 1 ; 
                else left = mid +1 ; 
            }else{
                if(target > num && target <= nums[right])left = mid+1 ; 
                else right = mid -1 ; 
            }
        }
        
        return -1 ; 
    }
}