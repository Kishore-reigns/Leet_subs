class Pair{
    int x , y , obs ; 
    public Pair(int x , int y , int obs){
        this.x = x ; 
        this.y = y ; 
        this.obs = obs ; 
    }
}

class Solution {
    int[] x = {1,-1,0,0} , y = {0,0,1,-1} ; 

    public int minimumObstacles(int[][] grid) {
        int n = grid.length , m = grid[0].length ; 
        boolean[][] visited = new boolean[n][m] ; 
        PriorityQueue<Pair>queue = new PriorityQueue<>((x,y)->x.obs - y.obs) ;
        queue.offer(new Pair(0,0,0));

        while(!queue.isEmpty()){
            Pair pair = queue.poll() ; 
            int i = pair.x , j = pair.y , obs = pair.obs ; 

            if( i == n-1 && j == m-1 )return obs ; 
            if(visited[i][j])continue ; 
            visited[i][j] = true ; 

            for(int k = 0 ; k < 4 ; k++){
                int u = i+x[k] , v = j+y[k];
                if(  u >= 0 && v >= 0 && u < n && v < m && !visited[u][v]){
                    if(grid[u][v] == 1){
                        queue.offer(new Pair(u,v,obs+1));
                    }else{
                        queue.offer(new Pair(u,v,obs));
                    }
                    
                }
            }
        }

        return 0 ; 

    }
}