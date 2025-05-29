class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length ; 
        for(int i = 0 ; i < n ; i++){
            try{
                int val = Integer.parseInt(tokens[i]);
                stack.push(val);
            }catch(Exception e){
                int a = stack.pop();
                switch(tokens[i]){
                    case "+":
                      stack.push(stack.pop() + a);
                      break ;
                    case "-":
                      stack.push(stack.pop()-a);
                      break ;
                    case "*":
                      stack.push(stack.pop() * a);
                      break ;
                    case "/":
                      stack.push(stack.pop()/a);
                      break ; 
                }
            }
        }
        return stack.pop() ; 
    }
}