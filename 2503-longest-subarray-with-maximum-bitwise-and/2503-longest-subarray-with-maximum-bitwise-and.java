class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0];

        for( int num : nums ){
            max = Math.max( num , max );
        }

        int currmax=0;
        int maxlen=-1;

        for( int i=0 ; i < nums.length ; i++ ){
            if( nums[i] == max ){
                currmax++;
                maxlen=Math.max( currmax , maxlen );
            }
            else{
                currmax=0;
            }
        }

        return maxlen;
    }
}