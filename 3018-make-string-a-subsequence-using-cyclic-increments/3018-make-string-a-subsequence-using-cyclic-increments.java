class Solution {
    public boolean canMakeSubsequence(String s1, String s2) {
        int n = s1.length() , m = s2.length() ; 
        if(n < m)return false ; 
        int i = 0 ,j = 0 ; 
        while( i < n ){
            if(j == m)return true ; 
            char a = s1.charAt(i) , b = s2.charAt(j);
            if(b == a){
                i++ ; j++ ; 
            }else{
                char c ; 
                if(a == 'z')c = 'a' ; 
                else c = (char) (a + 1) ; 
                if(b == c){
                     j++ ; 
                }
                i++ ; 
            } 
        }
        if(j == m)return true ; 
        return false ; 
    }
}