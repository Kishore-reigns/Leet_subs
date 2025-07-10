class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length(), m = t.length() ; 
        int[][] dp = new int[n][m];
        for(int[] a : dp)Arrays.fill(a,-1);
        return check(0,0,s,t,n,m,dp);
    }

    public int check(int i , int j , String s , String t, int n, int m, int[][] dp ){
        if(j == m )return 1 ; 
        if(i == n)return 0 ; 
        
        if(dp[i][j] != -1)return dp[i][j];

        int pick = 0; 
        if(s.charAt(i) == t.charAt(j)){
            pick = check(i+1,j+1,s,t,n,m,dp);
        }
        int notpick = check(i+1,j,s,t,n,m,dp);

        return dp[i][j] = pick + notpick ; 
    }
}