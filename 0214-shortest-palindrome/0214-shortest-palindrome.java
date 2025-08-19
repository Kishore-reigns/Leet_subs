class Solution {
    public String shortestPalindrome(String s){
        long prefix = 0 , suffix = 0 ; int  n = s.length(); 
        if(n == 0)return "";
        long base = 29L , mod = 1_000_000_007L; 
        int lastIndex = 0 ; long power = 1L ; 
        for(int i = 0 ;i <= n-1 ; i++){
            int c = (s.charAt(i) - 'a') + 1 ;

            prefix = (prefix * base)%mod ; 
            prefix = (prefix + c)%mod ; 
            suffix = (suffix + c * power)%mod ;  
            power = (power * base)%mod ; 

            if(prefix == suffix)lastIndex = i ; 
        }

        return new StringBuilder(s.substring(lastIndex+1,n)).reverse().toString() + s ; 
    }
}