class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(0,s,dp);
    }

    public int helper(int i,String s,int[] dp){

        if(i == s.length()){
            return 1; 
        }

        if(dp[i]!= -1 )return dp[i] ; 

        int ways = 0 ;
        if(s.charAt(i) != '0'){
            ways += helper(i+1,s,dp);
        }

        if(i+1 < s.length()){
            int two = Integer.parseInt(s.substring(i,i+2));
            if(two >= 10 && two <= 26){
                ways += helper(i+2,s,dp);
            }
        }

        return dp[i] = ways ; 

    
        

   
    }
}