class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i < n; i++){
            char c = s.charAt(i);
            if(c == '(')stack.push(c);
            else{
                if(!stack.isEmpty() && c == ')' && stack.peek() == '(')stack.pop();
                else stack.push(c);
            }
        }
        int mini = 0 ; 
        while(!stack.isEmpty()){
            stack.pop() ; 
            mini++ ; 
        }
        return mini ; 
    }
}