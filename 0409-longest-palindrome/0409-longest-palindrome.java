class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[52] ; 
        int res = 0 ;  
         boolean odd = false ; 
        for(char c : s.toCharArray()){
            if( c >= 'a' && c <= 'z')freq[c-'a']++ ; 
            else if(c >= 'A' && c <='Z')freq[c-'A'+26]++ ; 
        }
    
        for(int i : freq){
            if(i%2 == 0)res += i ; 
            else{
                res += i-1 ; 
            }
        }

        return (res < s.length())?res+1 : res ; 
    }
}