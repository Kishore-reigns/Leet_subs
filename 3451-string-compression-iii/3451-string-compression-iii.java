class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder() ; 
        int n = word.length() , w = 0 ; 
        char c = word.charAt(0) ; 
        w = 1 ; 
        for(int i = 1 ; i < n ; i++){
            if(c == word.charAt(i) && w < 9){
                w++ ;
            }else{
                comp.append(w).append(c) ; 
                c = word.charAt(i) ; 
                w = 1 ; 
            }
        }
        comp.append(w).append(c) ; 

        return comp.toString() ; 

    }
}