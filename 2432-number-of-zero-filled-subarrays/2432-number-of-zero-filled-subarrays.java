class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0 ;
        int n = nums.length ;  
        for(int i = 0 ;i < n ; i++){
            if(nums[i] == 0){
                int m = 1 , j = i ; 
                for( j = i ; j < n ; j++){
                    if(nums[j] == 0){
                        count += m ; 
                        m += 1 ; 
                    }else break ; 
                }
                i = j ; 
            }
        }
        return count ; 
    }
}