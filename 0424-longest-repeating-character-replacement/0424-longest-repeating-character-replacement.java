class Solution {
    public int characterReplacement(String s, int k) {
        
        int l = 0 , r = 0 , maxf = 0 , n = s.length() , res = 0;
        int[] freq = new int[26] ;

        while( r < n ){
            char c = s.charAt(r);
            freq[c-'A']++ ;
            maxf = Math.max(maxf,freq[c-'A']);
       
            while( (r- l +1) - maxf > k){
               freq[s.charAt(l)-'A']--;
               l++;
              
            }
            res = Math.max(r - l  +1 , res);
            r++ ; 
            

        }
        return res ; 

        
      
        
    }
}