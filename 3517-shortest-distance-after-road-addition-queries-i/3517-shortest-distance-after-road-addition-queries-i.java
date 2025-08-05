class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        
        int[] res = new int[queries.length];
        int k = 0 ; 

        List<List<Integer>>graph = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < n-1 ; i++){
            graph.get(i).add(i+1);
        }

        for(int[] q : queries){
            graph.get(q[0]).add(q[1]);
            res[k++] = bfs(0,graph,n-1);
        }

        return res ; 

        
    }

    public int bfs(int i , List<List<Integer>> graph, int dest){
        int count = 0 ; 
        Queue<int[]> queue = new LinkedList<>();
         boolean[] visited = new boolean[graph.size()];
        queue.add(new int[]{i,0});
        while(!queue.isEmpty()){
            int[] node = queue.poll();
            visited[node[0]] = true ; 

            if(node[0] == dest )return node[1];

            for(int neigh : graph.get(node[0])){
                if(!visited[neigh])
                queue.offer(new int[]{neigh,node[1]+1});
            }
        }

        return -1 ; 
    }
}