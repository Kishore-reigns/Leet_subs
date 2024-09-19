class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0 , j = 0 ; 
        if(s.length() == 0)return true ; 
        if(s.length() > t.length())return false ; 
        for(i = 0 ; i < t.length() ; i++){
            if(j < s.length() && s.charAt(j) == t.charAt(i))j++ ; 
        }
        if(j == s.length())return true ; 
        return false ; 
    }
}