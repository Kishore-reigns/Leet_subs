class Solution {
    public int firstUniqChar(String s) {
        int i = 0 ; 
        for(int c : s.toCharArray() ){
            if(s.indexOf(c) == s.lastIndexOf(c))return i ; 
            i++ ; 
        }
        return -1 ; 
        
        
    }
}