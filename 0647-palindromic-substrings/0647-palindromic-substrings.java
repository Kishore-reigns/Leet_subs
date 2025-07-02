class Solution {
    public int countSubstrings(String s) {
        int res = 0 , n = s.length() ; 

        for(int i = 0 ; i < n ; i++ ){
            res += isPali(s,i,i,n); // odd 
            res += isPali(s,i,i+1,n); // even
        }
        return res ; 
    }

    public int isPali(String s , int i , int j , int n  ){
        int count = 0 ; 
        while( (i >= 0 && j < n) && s.charAt(i) == s.charAt(j)){
            count++ ; 
            i-- ; 
            j++ ; 
        }
        return count ; 
    }

   

   
}