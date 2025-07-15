class Solution {
    HashSet<Integer>set ; 
    boolean[] visited ; 
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>>adj = new ArrayList<>();
        set = new HashSet<>();
        visited = new boolean[n] ; 
        for(int i = 0 ; i < n ; i++)adj.add(new ArrayList<>());
        for(int[]p : pre){
            adj.get(p[1]).add(p[0]);
        }

        for(int i = 0 ; i < n ; i++){
            if(!visited[i] && isCyclic(i,adj))return false ; 
        }

        return true ; 


    }

    public boolean isCyclic(int node,List<List<Integer>> adj){

        if(set.contains(node))return true ; 
        set.add(node);
        

        for(int neigh : adj.get(node)){
            if(!visited[neigh] && isCyclic(neigh,adj))return true ; 
        }

        visited[node] = true ; 

        set.remove(node);

        return false ; 

    }
}