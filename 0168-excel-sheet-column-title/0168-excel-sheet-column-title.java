class Solution {
    public String convertToTitle(int c) {
        StringBuilder res = new StringBuilder() ; 
        while( c > 0){
           c--;
           res.append( (char) ('A' + (c%26)  ));
           c /= 26 ; 
            
        }
        res = res.reverse() ; 
        return res.toString() ; 
    }
}