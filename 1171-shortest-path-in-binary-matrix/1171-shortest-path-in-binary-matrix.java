class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length ; 
        if(grid[0][0] == 1)return -1 ; 
        boolean[][] visited = new boolean[n][n] ; 
        PriorityQueue<int[]>queue = new PriorityQueue<>((x,y)->x[2]-y[2]);
        int[] x = {-1,-1,-1,0,0,1,1,1} , y = {-1,0,1,-1,1,-1,0,1};
        queue.offer(new int[]{0,0,1});
        
        
        while(!queue.isEmpty()){
            int[] cell = queue.poll() ; 
            int u = cell[0] , v = cell[1] ; 
            if(u == n-1 && v == n-1)return cell[2];
            visited[u][v] = true ; 
            for(int i = 0 ;i < 8 ; i++){
                int nextu =  u + x[i] , nextv = v + y[i] ;  
                //System.out.println(nextu + " "+nextv);
                if(boundaryCheck(nextu,nextv,n) && !visited[nextu][nextv] && grid[nextu][nextv] == 0){
                    
                    visited[nextu][nextv] = true ; 
                    queue.offer(new int[]{nextu,nextv,cell[2]+1});
                }
            }
        }

        return -1 ; 
    }

    public boolean boundaryCheck(int u , int v , int n ){
        return u < n && u >= 0 && v < n && v >=0 ; 
    }
}