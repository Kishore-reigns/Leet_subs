class Solution {

    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][]copy = new int[n][m] ;

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++)copy[i][j] = board[i][j] ; 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int neigh = cost(i, j, n, m, board);
                if (board[i][j] == 1) {
                    if (neigh < 2 || neigh > 3)
                        copy[i][j] = 0;
                } else {
                    if (neigh == 3)
                        copy[i][j] = 1;
                }
            }
        }

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++) board[i][j] = copy[i][j] ; 
        }
    }

    public int cost(int i, int j, int n, int m, int[][] board) {

        int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
        int count = 0;
        for (int k = 0; k < 8; k++) {
            int u = i + x[k], v = j + y[k];
            if (u >= 0 && v >= 0 && u < n && v < m) {
                if (board[u][v] == 1)
                    count++;
            }
        }

        return count;
    }
}