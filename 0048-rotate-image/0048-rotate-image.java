class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);

        reverseCol(matrix);
    
        
    }

    public void print(int[][] matrix){
        int n = matrix.length , m = matrix[0].length; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++ ){
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }
    }
    public void transpose(int[][] matrix){
        int n = matrix.length , m = matrix[0].length; 
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < m ; j++ ){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp ; 
            }
        }
    }

    public void reverseCol(int[][] matrix){
        int m = matrix[0].length , n = matrix.length ; 
        for(int i = 0 ; i < m/2 ; i++){
            for(int j = 0 ; j < n ; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][m-i-1];
                matrix[j][m-i-1] = temp ; 
            }
        }
    }
}