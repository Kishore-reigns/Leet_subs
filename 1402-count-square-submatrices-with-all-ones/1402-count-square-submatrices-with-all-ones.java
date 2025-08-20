class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length ; 
        int[][] a = new int[n][m];

        for(int i = 0 ; i < m ; i++)a[0][i] = matrix[0][i];
        for(int i = 0 ; i < n ; i++)a[i][0] = matrix[i][0];

        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                if(matrix[i][j] != 0)
                a[i][j] = 1 + Math.min(a[i][j-1],Math.min(a[i-1][j],a[i-1][j-1]));
            }
        }

        int sum = 0 ; 
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                sum += a[i][j];
            }
        }

        return sum ; 

    }
}