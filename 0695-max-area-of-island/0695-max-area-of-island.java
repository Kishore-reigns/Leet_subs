class Solution {
    private int[] x = {0,0,1,-1}, y = {1,-1,0,0};
    public int maxAreaOfIsland(int[][] grid) {

        int n = grid.length , m = grid[0].length ; 
        int res = 0 ; 
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 1){
                   res = Math.max(res,check(i,j,n,m,grid));
                }
            }
        }
        return res ;
    }

    public int check(int i, int j , int n , int m , int[][] grid){

        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0)return 0; 

        grid[i][j] = 0;
        int area = 1 ; 
        for(int k = 0 ; k < 4 ; k++){
            int u = i+x[k] , v = j+y[k] ;
            area += check(u,v,n,m,grid);
            
        }
        return area ; 
    }
}