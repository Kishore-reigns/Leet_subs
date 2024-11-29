class Solution {
    int[] parent , rank ; 
    public int findCircleNum(int[][] isCon) {
        int n = isCon.length ;
        int res = n ;  
        parent = new int[n] ; 
        rank = new int[n] ; 
        for(int i = 0 ; i < n ; i++){
            parent[i] = i ; 
            rank[i] = 0 ; 
        }
        for(int i = 0  ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                if(i!=j && isCon[i][j] == 1){
                    res -= union(i,j);
                }
            }
        }

        if(res == 0)return 1 ; 

        return res ; 
    }

    public int union(int u , int v){
        int up = find(u) , vp = find(v) ; 
        if(up == vp)return 0 ; 

        if(rank[up] > rank[vp]){
            parent[vp] = up ; 
            //rank[u] += rank[v] ; 
        }else if ( rank[up] < rank[vp] ){
            parent[up] = vp ; 
            //rank[v] += rank[u];
        }else{
            parent[vp] = up ; 
            rank[up]++ ; 
        }
        return 1 ; 
    }

    public int find(int u){

        if(u == parent[u])return u ; 
        return parent[u] = find(parent[u]);
    }
}