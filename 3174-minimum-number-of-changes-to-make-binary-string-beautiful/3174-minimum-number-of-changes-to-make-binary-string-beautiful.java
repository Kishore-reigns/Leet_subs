class Solution {
    public int minChanges(String s) {
        int change = 0 , t = 1 ; 
        char p = s.charAt(0);
        for(int i = 0 ;i < s.length() ; i+=2){
            char c = s.charAt(i);
            if(c != s.charAt(i+1))change++ ; 
        }

        return change;
    }
}