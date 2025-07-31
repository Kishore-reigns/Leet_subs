class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length , m = matrix[0].length ;

        int up = 0 , down = n-1 , left = 0 , right = m-1 ;
        int row = -1 ; 
        while(up <= down){
            int mid = (up + down +1) / 2 ; 
            if(matrix[mid][0] > target && matrix[mid][m-1] > target)down = mid -1 ;  
            else if(matrix[mid][0] < target && matrix[mid][m-1] < target)up = mid + 1 ; 
            else{
                row = mid ;
                break ; 
            }
        }

        if(row == -1)return false ; 

        while(left <= right){
            int mid = (left+right)/2 ; 
            if(matrix[row][mid] == target)return true ; 
            if(matrix[row][mid] < target)left = mid +1  ; 
            else right = mid - 1 ; 
        }
        return false ; 
    }
}