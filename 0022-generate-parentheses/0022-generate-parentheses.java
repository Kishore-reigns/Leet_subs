class Solution {

    StringBuilder stack = new StringBuilder();
    List<String>res = new ArrayList<>() ; 

    public List<String> generateParenthesis(int n) {
        generate(n,0,0);
        return res ; 
    }

    public void generate(int n , int open , int close){
        if(open == close && close == n){
            res.add(stack.toString());
            return ; 
        }

        if( open < n){
            stack.append('(');
            generate(n,open+1,close);
            stack.deleteCharAt(stack.length()-1);
        }

        if(close < open){
            stack.append(')');
            generate(n,open,close+1);
            stack.deleteCharAt(stack.length()-1);
        }


    }
}