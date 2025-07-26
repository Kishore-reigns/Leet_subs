class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0 , r = 0 , sum = 0 , max = Integer.MIN_VALUE;
        int n = nums.length ; 
        Set<Integer>seen = new HashSet<>();
        while( r < n){
            if(seen.add(nums[r])){
                sum += nums[r];
                max = Math.max(sum,max);
                r++;
            }else{
                while(l < r && seen.contains(nums[r])){
                    sum -= nums[l];
                    seen.remove(nums[l++]);
                }
            }
        }

        return max ; 
         
    }
}