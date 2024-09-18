class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length ; 
        int m = board[0].length ; 
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ;j < m ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(helper(i,j,0,board.length,board[0].length,board,word))return true ; 
                }
            }
        }
        return false;
    }
    public boolean helper(int i , int j ,int pt , int n , int m, char[][] board , String word){

        
        if(pt == word.length()){
            return true ; 
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(pt)) {
            return false;
        }
        char temp = board[i][j] ; 
        board[i][j] = '#' ;
        int[]x = {1,-1,0,0};
        int[]y = {0,0,1,-1};
        for(int k = 0 ;k < 4 ; k++){
            if(helper( i + x[k] ,  j + y[k] , pt+1 ,  n ,  m,  board ,  word))return true ; 
        }
        board[i][j] =temp;
        

        return false ; 

       
    }
}