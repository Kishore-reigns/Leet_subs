class Solution {
    public int countHillValley(int[] nums) {
        List<Integer>list = new ArrayList<>();
        int res = 0 ; int k = 0 ; 
        list.add(nums[0]);
        for(int i = 1 ; i < nums.length ; i++){
            if(list.get(k) != nums[i]){
                list.add(nums[i]);k++;
            }
        }
        
        for(int i = 1 ; i < list.size()-1 ; i++){
            if( (list.get(i) < list.get(i+1) && list.get(i) < list.get(i-1)) 
                || (list.get(i-1) < list.get(i) && list.get(i) > list.get(i+1))
            )res++ ; 
        }
        return res ;
    }
}