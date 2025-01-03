class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int count = 0;
        int[] x = {1,-1,0,0} , y = {0,0,1,-1} ; 
        Queue<int[]>queue = new LinkedList<>() ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && isInBoundary( n, m, i, j)) {
                    queue.offer(new int[]{i,j});
                    while(!queue.isEmpty()){
                        int[] pair = queue.poll() ; 
                        int u = pair[0] , v = pair[1] ;
                        grid[u][v] = 0 ; 
                        for(int k = 0 ; k < 4 ; k++){
                            if( withinBoundary(n,m,u+x[k],v+y[k]) && grid[u+x[k]][v+y[k]] == 1){
                                grid[u+x[k]][v+y[k]] = 0 ; 
                                queue.offer(new int[]{u+x[k],v+y[k]});
                            } 
                        }
                        
                    }
                }
                
                }
            }

            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    if(grid[i][j] == 1)count++ ; 
                }
            }
            return count ; 
        

    }

    public boolean isInBoundary(int n, int m, int x, int y) {
        return (x == 0 || y == 0 || x == n - 1 || y == m - 1);
    }

    public boolean withinBoundary(int n, int m, int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}