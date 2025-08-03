class Solution {
    int[] dp ; 
    public int numDecodings(String s) {
        dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return check(0,s);
    }

    public int check(int i , String s){
        if(i >= s.length())return 1 ; 

        if(dp[i] != -1)return dp[i];

        int one = 0 , two = 0 ; 
        if(s.charAt(i) != '0'){

            one += check(i+1,s);
            if(i+1 < s.length()){
                if( (s.charAt(i) == '1' && s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9') || 
                (s.charAt(i) == '2' && s.charAt(i+1) >= '0' && s.charAt(i+1) <= '6')){
                    two += check(i+2,s);
                }
            }
             
        }
        
        return dp[i] = one + two ; 

    }
}