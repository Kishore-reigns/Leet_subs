class Solution {

    int[] x = {0,0,1,-1} , y = {1,-1,0,0};
    
    public int findMaxFish(int[][] grid) {
        int n = grid.length  , m = grid[0].length ; 
        int maxi = 0 ;
     
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] != 0){
                    maxi = Math.max(maxi,check(i,j,n,m,grid));
                }
                
            }
        }
        return maxi ; 
    }

    public int check(int i , int j ,int n , int m, int[][] copy){
        if (i < 0 || j < 0 || i >= n || j >= m || copy[i][j] == 0)return 0 ;

        int prev = copy[i][j] ;
        copy[i][j] = 0 ; 
        for(int k = 0 ; k < 4 ; k++){
            int r = x[k] + i , c = y[k] + j ; 
            prev += check(r,c,n,m,copy); 
        }
        

        return prev ; 


    }
}