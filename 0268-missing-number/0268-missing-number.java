class Solution {
    public int missingNumber(int[] nums) {
        int v = nums.length ; 
        int x = 0 ; 
        for(int i = 0 ; i <= v ; i++)x = x ^ i ; 
        for(int n : nums)x = x ^ n ; 
        return x ;
    }
}