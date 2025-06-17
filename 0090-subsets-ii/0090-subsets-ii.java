class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        func(0,nums,new ArrayList<>());
        return result ; 

    }

    public void func(int i , int[] nums, List<Integer>list){
        if(i >= nums.length){
            result.add(new ArrayList<>(list));
            return ; 
        }
        list.add(nums[i]);
        func(i+1,nums,list);
        while(i < nums.length-1 && nums[i]==nums[i+1])i++ ; 
        list.remove(list.size()-1);
        func(i+1,nums,list);
        return ;
    }
}