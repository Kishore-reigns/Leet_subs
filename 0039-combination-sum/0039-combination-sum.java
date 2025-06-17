class Solution {
    public List<List<Integer>> combinationSum(int[] candi, int target) {
        List<List<Integer>>result = new ArrayList<>() ; 
        func(0,candi,target,result,new ArrayList<>());
        return result ; 
    }
    public void func(int i , int[] candi ,int target , List<List<Integer>>result , List<Integer>list){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return ;
        }
        if(target < 0 || i >= candi.length)return ; 

     
            list.add(candi[i]);
            func(i,candi,target-candi[i],result,list);
        
   
             list.remove(list.size()-1);
            func(i+1,candi,target,result,list);

        return  ;
       

      
    }
}