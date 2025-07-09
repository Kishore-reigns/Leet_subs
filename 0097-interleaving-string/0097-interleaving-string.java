class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length() , m = s2.length() , l = s3.length() ; 
        if(n+m != l)return false ; 
        boolean[][] dp = new boolean[n+1][m+1];
        dp[n][m] = true ; 
        for(int i = n ; i >=0 ; i--){
            for(int j = m ; j >= 0 ; j--){
                if( i < n && s1.charAt(i) == s3.charAt(i+j) && dp[i+1][j])dp[i][j] = true ; 
                if( j < m && s2.charAt(j) == s3.charAt(i+j) && dp[i][j+1])dp[i][j] = true ; 
            }
        }

        return dp[0][0] ; 
    }
}