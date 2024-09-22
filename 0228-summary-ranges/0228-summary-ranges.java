class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0)return list ; 
        int k = nums[0] , j = -100 ; 
        if(nums.length == 1){
            list.add(String.valueOf(k));
            return list;
            }
        for(int i = 1 ; i < nums.length ; i++){
            if( nums[i] == nums[i-1]+1){
                j = nums[i] ;
            }else{
                if(j!=-100)list.add(k+"->"+j);
                else list.add(String.valueOf(k));
                k = nums[i] ; 
                j = -100 ; 
            }
        }
        if( j!=-100) list.add(k+"->"+j);
        else list.add(String.valueOf(k));
        return list ; 
    }
}