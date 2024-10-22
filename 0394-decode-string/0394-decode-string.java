class Solution {
    public String decodeString(String s) {
        int n = s.length() ; 
        Stack<Integer> numstack = new Stack<>() ; 
        Stack<StringBuilder> charstack = new Stack<>() ;
        StringBuilder res = new StringBuilder("") ; 
        StringBuilder temp = new StringBuilder() ; 
        int times = 0, j = 0 , val = 0; 
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                val = 0 ; 
                while(Character.isDigit(s.charAt(i))){
                    val = val*10 + (s.charAt(i) - '0') ;
                    i++ ; 
                }
                i-- ; 
                numstack.push(val);
            }
            else if(c == '['){
                   charstack.push(res);
                   res = new StringBuilder();
                }
                else if(c == ']'){
                    times = numstack.pop() ; 
                    temp = res ; 
                     res = charstack.pop() ; j = 0 ; 
                     while(j < times){
                        res.append(temp);
                        j++ ; 
                     } 
                }
                else{
                    res.append(c);
                }
            
        }
        return res.toString() ; 
    }
}