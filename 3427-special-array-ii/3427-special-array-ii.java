class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length ,  q = queries.length ; 
        boolean[] res = new boolean[q] ; 
        int prefix[] = new int[n] ; 
        int j = 0 ;
         for(int i = 1 ; i < n ; i++){
                if( (nums[i-1]%2 == 0 && nums[i]%2 == 0 ) || (nums[i-1]%2 != 0 && nums[i]%2 != 0 )){
                    prefix[i] = prefix[i-1] + 1  ; 
                }else{
                    prefix[i] = prefix[i-1] ; 
                }
            }

        for(int[] range : queries){
           int isspl = prefix[range[1]] - prefix[range[0]] ; 
            if(isspl > 0){
                res[j++] = false ; 
            }else{
                res[j++] = true ; 
            }
        }
        return res ; 
    }
}