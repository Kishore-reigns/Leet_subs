class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length , low = 1 , high = Arrays.stream(nums).max().getAsInt();
        int ans = 0 ; 
        while(low <= high){
            int mid = (low+high) / 2 ;
            int value = check(nums,mid);
            if( value <= threshold){
                ans = mid ; 
                high = mid - 1 ; 
            }else{
                low = mid + 1 ; 
            }
        } 

        return ans ; 
    }

    public int check(int[] nums, int div){
        
        int sum = 0 ; 
        for(int n : nums){
            
            sum += (int)Math.ceil((double)n/(double)div) ; 
        }
        return sum ; 
    }
}