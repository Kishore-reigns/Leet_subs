class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1 , mat[][] = new int[n][n]; 
        int top = 0 , left = 0 , bottom = n-1 , right = n-1 ; 
        
        while(top <= bottom && left <= right){

            for(int i = left ; i <= right ; i++){
                mat[top][i] = num++ ; 
            }
            top++ ; 

            for(int i = top ; i <= bottom ; i++){
                mat[i][right] = num++ ; 
            }
            right-- ; 

            if(left > right && top > bottom)break ; 

            for(int i = right ; i >= left ; i-- ){
                mat[bottom][i] = num++ ; 
            }
            bottom-- ; 

            for(int i = bottom ; i >= top ; i--){
                mat[i][left] = num++ ; 
            }
            left++ ; 
        }
        return mat ; 
    }
}