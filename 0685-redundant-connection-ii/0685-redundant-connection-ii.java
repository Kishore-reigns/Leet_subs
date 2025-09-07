class DisjointSet{
    int[] rank , parent ; 
    public DisjointSet(int n){
        rank = new int[n+1] ; 
        parent = new int[n+1];
        Arrays.fill(rank,0);
        for(int i = 0 ; i <= n ; i++)parent[i] = i ;
    }

    public int find(int node){
        if(parent[node] == node)return node ; 
        return parent[node] = find(parent[node]);
    }

    public boolean union(int u , int v){
        int pu = find(u) , pv = find(v) ; 

        if(pu==pv)return false  ; 
        if(rank[pu] < rank[pv]){
            parent[pu] = pv ; 
        }else if(rank[pv] < rank[pu]){
            parent[pv] = pu ; 
        }else{
            parent[pv] = pu ; 
            rank[pu]++ ;
        }

        return true ;
    }
}

class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        
        int[] cand1 = null , cand2 = null  ; 
        int n = edges.length ; 
        // find for node with two parent 
        int[] p = new int[n+1]; 
        for(int[] e : edges){
            int u = e[0] , v = e[1];
            if(p[v] != 0){
                cand1 = new int[]{p[v],v};
                cand2 = new int[]{u,v};
                e[1] = 0 ; 
            }else{
                p[v] = u ; 
            }

        }

        // check for cycle
        DisjointSet ds = new DisjointSet(edges.length);
        for(int[] e : edges){

            if(e[1] == 0)continue ; 
            if(!ds.union(e[0],e[1])){
                if(cand1 == null)return e ; 
                return cand1 ; 
            }

        }

        return cand2 ; 
    }
}