class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a") ;

        while(s.length() <= k ){
            StringBuilder t = new StringBuilder();
            for(char c : s.toString().toCharArray()){
                t.append( (char)( 'a' + (c - 'a' + 1)%26) );
            }
            s.append(t);
        }
        return s.charAt(k-1);
    }
}