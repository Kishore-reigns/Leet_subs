class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ; 
        sub(0,nums,result,new ArrayList<>());
        return result ; 
    }

    public void sub(int i, int[] nums, List<List<Integer>>result, List<Integer>list){
        if(i >= nums.length){
            result.add(new ArrayList<>(list));
            return ; 
        }

        //pick
        list.add(nums[i]);
        sub(i+1,nums,result,list);
        //notpick
        list.remove(list.size()-1);
        sub(i+1,nums,result,list);

        return ; 
    }

}