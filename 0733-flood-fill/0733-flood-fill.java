class Pair{
    int x , y , col ; 
    public Pair(int x , int y , int col){
        this.x =x ; this.y = y ; this.col = col ; 
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair>queue = new LinkedList<>();
        int n = image.length , m = image[0].length ; 
        int ogcol = image[sr][sc] ; 
        queue.offer(new Pair(sr,sc,ogcol));

        int[] x = {1,-1,0,0} , y = {0,0,1,-1};
        boolean[][] visited = new boolean[n][m];
        int[][] res = new int[n][m] ; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                res[i][j] = image[i][j] ; 
            }
        }
        while(!queue.isEmpty()){
            Pair pair = queue.poll() ; 
            visited[pair.x][pair.y] = true ; 
            for(int k = 0 ; k < 4 ; k++){
                int u = pair.x + x[k] ; 
                int v = pair.y + y[k] ;
                if( u >= 0 && u < n && v >= 0 && v < m && !visited[u][v]  && image[u][v] == ogcol ){
                    visited[u][v] = true ; 
                    res[u][v] = color ; 
                    queue.offer(new Pair(u,v,image[u][v]));
                }
                res[pair.x][pair.y] = color ; 
            }
        }
        return res ; 
    }
}