class Solution {
    public boolean detectCapitalUse(String word) {
        int lower = 0 , upper = 0 ; 
        for(int i = 0 ;i < word.length() ; i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c))upper++ ; 
            if(Character.isLowerCase(c))lower++ ;
        } 
        if(upper == word.length())return true ; 
        if(lower == word.length())return true ; 
        if(Character.isUpperCase(word.charAt(0)) && upper <= 1)return true ; 
        return false ;

    }
}