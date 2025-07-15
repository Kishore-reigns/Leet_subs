class Solution {
    private List<Integer>res ; 
    private HashSet<Integer> set ; 
    private boolean[] visited ;
    private List<List<Integer>> adj ; 
    private boolean hasCycle = false ; 

    public int[] findOrder(int n, int[][] pre) {
        res = new ArrayList<>();
        set = new HashSet<>();
        visited = new boolean[n] ;
        adj = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)adj.add(new ArrayList<>());
        for(int[] p : pre)adj.get(p[1]).add(p[0]);

        for(int i = 0 ; i< n ; i++){
            if(!visited[i])dfs(i,adj);
            if(hasCycle)return new int[0];
        }

        Collections.reverse(res);

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }

    public void dfs(int node , List<List<Integer>> adj){
        
        if(set.contains(node)){
            hasCycle = true ; 
            return ; 
        }
        set.add(node);

        for(int neigh : adj.get(node)){
            if(!visited[neigh])dfs(neigh,adj);
        }

        set.remove(node);
        visited[node] = true ; 
        res.add(node);
    }
}