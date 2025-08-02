class Solution {

    int dp[][] ; 
    int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length ; 
        dp = new int[n][m];
        for(int i = 0 ; i < n ; i++)Arrays.fill(dp[i],-1);
        int res = Integer.MIN_VALUE ; 
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < m ; j++){
                int count = dfs(i,j,matrix);
                res = Math.max(count,res);
            }
        }

        return res ; 
    }

    public int dfs(int i , int j , int[][] matrix){
        
        if(dp[i][j] != -1)return dp[i][j] ;
        int count = 1 ; 
        for(int[] d : dir){
            int u = i + d[0] , v = j + d[1] ; 
            if(isWithin(u,v,matrix) && matrix[u][v] > matrix[i][j]){
                count = Math.max(count,1 + dfs(u,v,matrix));
            }
        }
        
        return dp[i][j] = count ; 
    }

    public boolean isWithin(int i , int j , int[][] matrix){
        return i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length ; 
    }
}