class Solution {
    int[] x = {0,0,1,-1}, y = {1,-1,0,0} ;
    public boolean exist(char[][] board, String word) {
        int n = board.length , m = board[0].length , len = word.length() , k = 0 ; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(isfound(i,j,board,n,m,k,word,len))return true ; 
                }
            }
        }
        return false ; 
    }

    public boolean isfound(int i, int j , char[][] board , int n , int m , int k , String word, int len){
        
        if(k == len)return true ; 
        if(i < 0 || i >= n || j < 0 || j >= m)return false ; 
       

        if(word.charAt(k) == board[i][j]){
            k++ ; 
            char prev = board[i][j];
            board[i][j] = '#';
            for(int dir = 0 ; dir < 4 ; dir++){
                int u = x[dir] + i , v = y[dir] + j ; 
                if(isfound(u,v,board,n,m,k,word,len))return true ; 
            }
            board[i][j] = prev ; 
            k-- ; 
        }
        return false ; 

        
        
    }
}