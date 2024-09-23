class Solution {
    public int minExtraChar(String str, String[] dict) {
       int n = str.length();
       int[]dp = new int[n];
       Set<String>set = new HashSet<>();
       for(String s : dict)set.add(s);
        Arrays.fill(dp,-1);
        return helper(0,n,str,set,dp) ; 
    }
    public int helper(int in , int n , String str , Set<String> set , int[] dp){
        if(in >= n )return 0 ; 
        if(dp[in] != -1 )return dp[in] ; 
        int res = 1 + helper(in+1,n,str,set,dp); 
        for(int i = in+1 ; i<= n ; i++){
                if(set.contains(str.substring(in,i))){
                    res = Math.min(res,helper(i,n,str,set,dp));
            }
        }
        return dp[in] = res ; 
    }
}