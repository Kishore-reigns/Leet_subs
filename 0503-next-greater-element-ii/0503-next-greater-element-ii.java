class Pair{
    int value , index ; 
    public Pair(int value , int index){
        this.value = value ; 
        this.index = index ; 
    }
}
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Pair> stack = new Stack<>() ; 
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int n = nums.length ; 
        int[] res = new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
            stack.push(new Pair(nums[i],i));
        }
        for(int i = n-1 ; i>= 0 ; i--){

            while(!stack.isEmpty() && stack.peek().value <= nums[i])stack.pop() ; 
            res[i] = stack.isEmpty()? -1 : nums[stack.peek().index] ; 
            stack.push(new Pair(nums[i],i));
            
        }
        return res ; 
    }
}