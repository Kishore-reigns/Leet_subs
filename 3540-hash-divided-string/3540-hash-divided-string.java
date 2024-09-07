class Solution {
    public String stringHash(String s, int k) {
        int n = s.length() ; 
        int subs = n/k ; 
        char[] result = new char[subs] ;
        int rindex = 0 ; 
        for(int i = 0 ; i <= n - k ; i += k , rindex++ ){
            String sub = s.substring(i,i+k);
            int sum = 0 ; 
            for(int j = 0 ; j < sub.length() ; j++){
                sum += sub.charAt(j) - 'a' ; 
            }
            sum = sum % 26 ; 
            result[rindex] = (char) (sum + 'a') ;  
        }
       
        return new String(result) ;    
    }
}