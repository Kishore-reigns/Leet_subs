class Solution {
    List<List<Integer>>res ; 
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        int n = graph.length ; 
        temp.add(0);
        dfs(0,n,graph,temp);

        return res ; 
    }

    public void dfs(int node ,int n, int[][] graph , List<Integer>temp){

        if(node == n-1){
            res.add(new ArrayList<>(temp));
            return ; 
        }

        for(int neigh : graph[node]){
            temp.add(neigh);
            dfs(neigh,n,graph,temp);
            temp.remove(temp.size()-1);
        }

    }
}