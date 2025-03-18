class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length  ;
        int[] res = new int[n];
        Arrays.fill(res,0);
        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2 ; 
                nums[i+1] = 0 ; 
            }
        }
        int i = 0 ; 
        for(int q : nums){
            if(q != 0)res[i++] = q ;
        }
        return res ; 
        
    }
}