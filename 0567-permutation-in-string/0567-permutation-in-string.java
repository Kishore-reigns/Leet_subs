class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length() ; 

        if(s1.length() > s2.length() )return false ; 

        int[] s1count = new int[26] ; 
        int[] s2count = new int[26] ;

        for(int i = 0 ; i < n ; i++){
            s1count[ s1.charAt(i) - 'a']++ ; 
            s2count[ s2.charAt(i) - 'a']++ ; 
        }

        if(matches(s1count,s2count))return true ; 

        for(int i = n ; i < s2.length() ; i++ ){
            s2count[s2.charAt(i-n) - 'a']-- ; 
            s2count[ s2.charAt(i) - 'a']++ ;
            if(matches(s1count,s2count))return true ;  
        }

        return false ; 
       
    }

    public boolean matches(int[] s1 , int[] s2){
        for(int i = 0 ; i < 26 ; i++){
            if(s1[i] != s2[i])return false ; 
        }
        return true ; 
    }
}