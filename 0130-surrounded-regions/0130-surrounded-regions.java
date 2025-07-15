class Solution {

    int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    int n , m ; 
    public void solve(char[][] board) {
         n = board.length ;m = board[0].length ;
        boolean[][] haso = new boolean[n][m] ; 
        for(int i = 0 ; i < m ; i++){
            if(board[0][i] == 'O')dfs(0,i,board,haso);
            if(board[n-1][i] == 'O')dfs(n-1,i,board,haso);
        } 

        for(int i = 0 ; i < n ; i++){
            if(board[i][0] == 'O')dfs(i,0,board,haso);
            if(board[i][m-1] =='O')dfs(i,m-1,board,haso);
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(!haso[i][j] && board[i][j] != 'X')board[i][j] = 'X';
            }
        }
        
    }

    public void dfs(int i , int j , char[][] board, boolean[][] haso){
       
        haso[i][j] = true ; 
        for(int[] d : directions){
            int u = i+d[0] , v = j+d[1] ; 
            if( u >= 0 && u < n && v >= 0 && v < m && !haso[u][v] && board[u][v] == 'O'){
                dfs(u,v,board,haso);
            }

        }
        
    }


}