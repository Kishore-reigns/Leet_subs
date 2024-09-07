class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length() ; 
        StringBuilder enc = new StringBuilder() ; 
        for(int i = 0 ; i < s.length() ; i++){
            enc.append(s.charAt((i+k)%n))  ; 
        }
        return enc.toString() ; 
    }
}