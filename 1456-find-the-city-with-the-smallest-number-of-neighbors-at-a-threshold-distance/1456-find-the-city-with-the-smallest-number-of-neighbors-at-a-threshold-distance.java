class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n] ; 
        int maxi = Integer.MAX_VALUE ; 
        for(int i = 0 ; i < n ;i++){
            Arrays.fill(dist[i],maxi);
            dist[i][i] = 0 ; 
        }
        for(int[] e : edges){
            dist[e[0]][e[1]] = e[2] ; 
            dist[e[1]][e[0]] = e[2] ;
        }

        // floyd warshall to find min distance
        for(int k = 0 ;k < n ; k++){
            for(int i = 0 ; i < n ;i++){
                for(int j = 0 ;j < n ;j++){
                    if(dist[i][k] != maxi && dist[k][j] != maxi){
                        dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }

        // actual problem
        int city = -1 , neighs = maxi ; 
        for(int i = 0 ;i < n ;i++){
            int count = 0 ; 
            for(int j : dist[i]){
                if(j <= distanceThreshold)count++ ; 
            }
            if(count <= neighs){
                neighs = count ; 
                city = i ; 
            }
        }

        return city ; 
       

    }
}