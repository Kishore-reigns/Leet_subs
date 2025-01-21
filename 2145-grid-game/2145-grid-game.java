class Solution {
    public long gridGame(int[][] grid) {
        long mini = Long.MAX_VALUE ; 
        long top = 0 , bottom = 0 ;
        for(int i  = 0 ; i < grid[0].length ; i++)top += grid[0][i];
        for(int i = 0 ; i < grid[0].length ; ++i){
            top -= grid[0][i] ; 
            mini = Math.min(mini,Math.max(top,bottom));
            bottom += grid[1][i];
        }
        return mini ; 
    }
}