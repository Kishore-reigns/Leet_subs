class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0 , avg = 0 ; 
        for(int i = 0 ; i < k ; i++){
            sum+= nums[i] ; 
        }
        avg = sum/k ;

        for(int i = k ; i < nums.length ; i++){
             sum = sum - nums[i-k] + nums[i] ;
             avg = Math.max(avg,sum/k);
        }

        return avg ; 
    }
}