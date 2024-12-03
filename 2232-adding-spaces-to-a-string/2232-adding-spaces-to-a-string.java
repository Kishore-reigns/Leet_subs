class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int n = spaces.length ; 
        int j = 0 , i = 0 ; 
        while( j < n ){
            for( ; i < spaces[j] ; i++ ){
                str.append(s.charAt(i));
            }
            str.append(' ');
             i = spaces[j];
            j++ ; 
             
        }
         for( ; i < s.length() ; i++ ){
                str.append(s.charAt(i));
            }
        return str.toString() ; 
    }
}