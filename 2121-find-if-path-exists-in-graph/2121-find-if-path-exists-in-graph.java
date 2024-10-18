class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        DS ds = new DS(n);
        for(int[] edge : edges){
            ds.union(edge[0],edge[1]);
        }
        if(ds.find(s) == ds.find(d))return true ; 
        return false ; 
    }

    class DS{

        int[]rank , parent ; 
        public DS(int size){
            rank = new int[size+1] ; 
            parent = new int[size+1] ; 
            for(int i = 0 ; i <= size ; i++){
                parent[i] = i ; 
            }
        }

        public int find(int u){
            if(parent[u] != u){
                parent[u] = find(parent[u]);
            }
            return parent[u] ; 
        }

        public boolean union(int u , int v){
            int rootu = find(u) , rootv = find(v) ; 

            if(rootu == rootv)return false ; 

            if(rank[rootu] > rank[rootv]){
                parent[rootv] = rootu ; 
            }else if(rank[rootu] < rank[rootv]){
                parent[rootu] = rootv ; 
            }else{
                parent[rootv] = rootu ; 
                rank[rootu]++ ; 
            }
            return false ; 
        }
    }
}