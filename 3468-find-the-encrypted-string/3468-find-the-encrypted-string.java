class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length() ; 
        String enc = new String() ; 
        for(int i = 0 ; i < s.length() ; i++){
            enc += s.charAt((i+k)%n) ; 
        }
        return enc ; 
    }
}