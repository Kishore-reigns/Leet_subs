class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 0 , rl = -1, rr = -1; 
        int n = s.length() ; 
        for(int i = 0 ; i < n ; i++){
            // odd 
            int l = i , r = i ; 
            while( (l >= 0 && r < n) && s.charAt(l) == s.charAt(r) ){
                if( r-l+1 > maxlen){
                    maxlen = r-l+1 ; 
                    rl = l ; 
                    rr = r ; 
                }
                l-- ; r++ ; 
            }

            //even
            l = i ; r = i+1 ; 

            while((l>=0 && r < n) && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > maxlen){
                    maxlen = r-l+1;
                    rl = l ; 
                    rr = r ; 
                }
                l-- ; r++ ; 
            }
        }

        return s.substring(rl,rr+1);
    }
}