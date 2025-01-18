class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length ; 
        int[] ans = new int[n];
        Stack<int[]>stack = new Stack<>() ;
        for(int i = n-1 ; i > -1 ; i--){
            while(!stack.isEmpty() && temp[i] >= stack.peek()[0]){
                stack.pop() ; 
            }
            ans[i] = (!stack.isEmpty())? Math.abs(i-stack.peek()[1]) : 0 ;
            stack.push(new int[]{temp[i],i});
        }
        return ans ; 
        
    }
}