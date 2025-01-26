class Solution {
    public int[][] highestPeak(int[][] isWater) {
        Queue<int[]>queue = new LinkedList<>() ; 
        int n = isWater.length , m = isWater[0].length ; 
        int[][] res = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                res[i][j] = -1 ; 
                if(isWater[i][j] == 1){
                    queue.offer(new int[]{i,j,0});
                    res[i][j] = 0 ; 
                }
            
            }
        }
        int x[] = {0,0,1,-1} , y[] = {1,-1,0,0} ; 

        while(!queue.isEmpty()){
            int[] cur = queue.poll() ; 
            
            for(int i = 0 ; i < 4 ; i++){
                int nextx = cur[0]+x[i] , nexty = cur[1]+y[i] ; 
                if(nextx < n && nextx >= 0 && nexty < m && nexty >= 0){
                    if(res[nextx][nexty] == -1){
                        res[nextx][nexty] = cur[2]+1 ; 
                        queue.offer(new int[]{nextx,nexty,cur[2]+1});
                    }
                }
            }
        }
        return res ; 
    }
}