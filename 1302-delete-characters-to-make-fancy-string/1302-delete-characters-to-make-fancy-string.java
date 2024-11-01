class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder() ; 
        int count = 1 ; 
        char p = s.charAt(0);
        str.append(p);
        for(int i = 1 ; i < s.length() ; i++){
             char c = s.charAt(i) ; 
             if(c == p){
                count++ ; 
             }else{
                count = 1 ; 
             }
             if(count <= 2)str.append(c);
             p = c ; 
        }

        return str.toString() ; 
    }
}