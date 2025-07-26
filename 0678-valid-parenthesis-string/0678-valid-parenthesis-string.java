class Solution {
    public boolean checkValidString(String s) {
       int leftmin = 0 , leftmax = 0 ; 
       for(char c : s.toCharArray()){
        if(c == '('){
            leftmin++ ; leftmax++ ; 
        }else if(c == ')'){
            leftmin-- ; leftmax-- ; 
        }else{
            leftmin-- ; leftmax++ ; 
        }
        if(leftmax < 0)return false ; 
        if(leftmin < 0)leftmin = 0 ; 
       }

       return leftmin == 0   ; 
    }

    public boolean check(int i , String s , Stack<Character>stack){
        
        if(i == s.length()) return stack.isEmpty(); 
       

        if(s.charAt(i) == '*'){
            stack.push('(');
            if(check(i+1,s,stack))return true ; 
            stack.pop(); 
            stack.push(')');
            if(check(i+1,s,stack))return true ;
            stack.pop();
            if(check(i+1,s,stack))return true ;
        }else if(s.charAt(i) == '('){
            stack.push('(');
            if(check(i+1,s,stack))return true ; 
        }else if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '('){
            stack.pop();
            if(check(i+1,s,stack))return true ; 
        } 
        
        return false ; 

    }
}