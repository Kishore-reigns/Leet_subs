class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n] ; 
        for(int[] a : dp)Arrays.fill(a,-1);
        return check(0,0,m,n,dp);
    }

    public int check(int i , int j , int n , int m , int[][] dp ){
        if(i == n-1 && j == m-1)return 1 ; 
        if(i < 0 || i >= n || j < 0 || j >= m )return 0 ; 

        if(dp[i][j] != -1)return dp[i][j] ; 
        int down = check(i+1,j,n,m,dp);
        int right = check(i,j+1,n,m,dp);

        return dp[i][j] = down + right ; 
    }
}