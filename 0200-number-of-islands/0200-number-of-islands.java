class Solution {
    private int[] x = {0,0,1,-1} , y = {1,-1,0,0};
    public int numIslands(char[][] grid) {

        int n = grid.length , m = grid[0].length ; 
        int res = 0 ; 
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == '1'){
                    check(i,j,n,m,grid);res++ ;
                }
            }
        }
        return res ;
    }

    public void check(int i, int j , int n , int m , char[][] grid){

        if(i < 0 || i >= n || j < 0 || j >= m)return  ; 
        if(grid[i][j] != '1')return ; 

        grid[i][j] = '0';
        for(int k = 0 ; k < 4 ; k++){
            int u = i+x[k] , v = j+y[k] ;
            
                 check(u,v,n,m,grid);
            
        }
        return  ; 
    }
}