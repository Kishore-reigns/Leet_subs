class Solution {
    public void solve(char[][] board) {
        int m = board.length , n = board[0].length ;

        for(int i = 0 ; i < m ; i++){
            dfs(board,i,0,m,n);
            dfs(board,i,n-1,m,n);
        } 

        for(int i = 0 ; i < n ; i++){
            dfs(board,0,i,m,n);
            dfs(board,m-1,i,m,n);
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == 'O')board[i][j] = 'X';
                else if(board[i][j] == 'v')board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board , int i , int j , int m , int n){

        if( i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O' )return ;
        board[i][j] = 'v' ; 

        dfs(board,i+1,j,m,n);
        dfs(board,i-1,j,m,n);
        dfs(board,i,j+1,m,n);
        dfs(board,i,j-1,m,n); 
    }
}