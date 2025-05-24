class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0 , n = nums.length; 
        Set<Integer> set = new HashSet<>();
        int i = 0 , j = 0 ;
        while( j < n ){
            if(set.contains(nums[j])){
                set.clear();
                i+= 3 ; 
                j = i;
                count++ ; 
            }else{
                set.add(nums[j]);
                j++;
            }
            

        }
        return count ; 
    }
}