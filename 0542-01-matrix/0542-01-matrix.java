class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[] x = { 0, 0, 1, -1 }, y = { 1, -1, 0, 0 };
        boolean[][] visited = new boolean[n][m];
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(mat[i][j] == 0){
                    queue.offer(new int[]{i,j,0});
                    visited[i][j] = true ; 
                    res[i][j] = 0 ; 
                }
                
            }
        }

        while(!queue.isEmpty()){
            int[] pair = queue.poll() ; 
            int u = pair[0] , v = pair[1] , dist = pair[2] ; 
            res[u][v] = dist ; 
            for(int k = 0 ; k < 4 ; k++){
                int nx = u + x[k] , ny = v + y[k] ;  
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]){
                    queue.offer(new int[]{nx,ny,dist+1});
                    visited[nx][ny] = true ; 
                }
            }
        }

        return res;

    }
}