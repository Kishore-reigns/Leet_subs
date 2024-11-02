class Solution {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        int n = s.length() ; 
        for(int i = 0 ;i < n ; i++){
            char c = s.charAt(i) ; 
            if(c == '*'){
                stack.deleteCharAt(stack.length()-1);
            }else{
                stack.append(c);
            }
        }
        return stack.toString() ; 
    }
}