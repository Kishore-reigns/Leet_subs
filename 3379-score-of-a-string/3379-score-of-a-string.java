class Solution {
    public int scoreOfString(String s) {
        int n = s.length() ; 
        if(n==0)return 0 ; 
        int sum = 0 ; 
        for(int i = 0 ; i < n -1 ;  i++){
            sum += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return sum ; 
    }
}