class Solution {
    public boolean doesAliceWin(String s) {
        int count = 0;
        String vowels = "aeiou"; 
        for(char c : s.toCharArray()){
            if( vowels.indexOf(c) != -1)count++ ;
        }

        if(count == 0)return false ; 

        return true ; 
    }
}