class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0 , rem = -1 , i = 0 ;
        HashMap<Integer,Integer>map = new HashMap<>() ; 
        map.put(0,-1); 

        for(i = 0 ; i < nums.length ; i++){
            sum+= nums[i] ; 
            rem = sum%k ; 
            if(rem < 0){
                rem += k ; 
            }

            if(map.containsKey(rem)){
                if(i - map.get(rem) > 1)return true ; 
            }else{
                map.put(rem,i);
            }
           
        }
        return false ; 
    }
}