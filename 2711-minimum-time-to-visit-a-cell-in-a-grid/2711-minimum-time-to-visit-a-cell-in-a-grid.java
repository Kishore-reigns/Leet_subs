class Pair{
    int x , y, time ; 
    public Pair(int x , int y , int time){
        this.x = x ; 
        this.y = y ; 
        this.time = time ; 
    }
    public String toString(){
        return "(" + x + "," + y + "," + time +")";
    }
}

class Solution {
    int[] x = {1,-1,0,0} , y = {0,0,1,-1} ; 
    public int minimumTime(int[][] grid) {
        if(grid[0][1] > 1 && grid[1][0] > 1)return -1 ; 
        int n = grid.length , m = grid[0].length ; 
        boolean[][] visited = new boolean[n][m] ; 
        PriorityQueue<Pair> queue = new PriorityQueue<>( (x,y) -> x.time - y.time);
        queue.offer(new Pair(0,0,0));
        while(!queue.isEmpty()){
            Pair pair = queue.poll() ; 
            int i = pair.x , j = pair.y , time = pair.time ; 
            
            if(i == n-1 && j == m-1)return time ; 
            if(visited[i][j])continue ; 
            visited[i][j] = true ; 
            for(int k = 0 ; k < 4 ; k++){
                int u = i+x[k] , v = j+y[k] ; 
                if(iswithinBound(u,v,n,m) && !visited[u][v]){
                    int wait = grid[u][v] ; 
                    int arr = time + 1; 
                    if(wait > arr){
                       if( (wait - arr) % 2 == 0)arr = wait ;
                       else arr = wait+1 ;  
                    }

                     queue.offer(new Pair(u,v,arr));
                }
            }
        }
        return -1 ; 
    }

    public boolean iswithinBound(int u , int v , int n , int m ){
        return ( u >= 0 && v >= 0 && u < n && v < m ) ; 
    }
}