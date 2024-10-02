class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder() ; 
        int n = word1.length() , m = word2.length();
        int i = 0 , j = 0 , k = 0; 
        while( i < n && j < m ){
            if( k == 0 ){
                res.append( word1.charAt(i++));
                k = 1 ; 
            }else{
                res.append(word2.charAt(j++));
                k  = 0 ; 
            }
        }

        while(i < n){
            res.append( word1.charAt(i++));
        }
        while(j < m){
           res.append(word2.charAt(j++));
        }
        
        return res.toString() ; 
    }
}