class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        per(0,nums,result);
        return result ; 
    }

    public void per(int idx , int[]nums ,List<List<Integer>>result){
        
        if(idx >= nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j : nums)list.add(j);
            result.add(list);
            return; 
        }

        for(int i = idx ; i < nums.length ; i++){
            swap(nums,i,idx);
            per(idx+1,nums,result);
            swap(nums,i,idx);
        }

        return ; 
    }

    public void swap(int[]nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ; 
    }
}