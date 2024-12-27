class Solution {
    public int findMin(int[] nums) {
        int max = Integer.MAX_VALUE , n = nums.length , low = 0 , high = n-1;

        while(low<=high){
            int mid = ( low+high ) / 2 ;

            if(nums[mid] < max)max = nums[mid] ; 

            if(nums[mid] < nums[high]){
                high = mid - 1  ; 
            }
            else if( nums[low] <= nums[high] ){
                high = mid-1 ; 
            }else{
                low = mid+ 1; 
            }
        } 

        return max ; 

    }
}