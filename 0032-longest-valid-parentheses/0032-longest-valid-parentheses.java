class Solution {
    public int longestValidParentheses(String s) {
        int len = 0 , last = -1 ; 
       
        Stack<Integer>stack = new Stack<>();
        stack.push(-1);
        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i);
            if(c == '(')stack.push(i);
            else{
                stack.pop() ; 
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    len = Math.max(len,i-stack.peek());
                }
                    
                    
                }
            }

            return len ;
        }
    
}