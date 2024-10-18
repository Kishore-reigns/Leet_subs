import java.util.*;

class Pair {
    int node, parent;

    public Pair(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Union ds = new Union(edges.length+1);
        for (int[] edge : edges) {
            int u = edge[0] , v = edge[1]; 
            if(!ds.union(u,v)){
                return edge ; 
            }
        }   

        return new int[]{} ; 

    }

    class Union{
        private int[] parent , rank ; 
        public Union(int size){
            parent = new int[size] ; 
            rank = new int[size] ; 
            for(int i = 0 ;i < size ; i++){
                parent[i] = i ; 
            }
        }

        public int find(int u){
            if(parent[u]!= u){
                parent[u] = find(parent[u]) ; 
            }
            return parent[u] ; 
        }

        public boolean union(int u , int v){
            int rootu = find(u) ; 
            int rootv = find(v) ; 
            
            if(rootu == rootv)return false ; 

            if(rank[rootu] < rank[rootv]){
                parent[rootv] = rootu ; 
            }else if( rank[rootu] > rank[rootv]){
                parent[rootu] = rootv ; 
            }else{
                parent[rootv] = parent[rootu] ; 
                rank[rootu]++ ; 
            }
            return true ; 
        }
        
    }

    public boolean isCycle(int u, int v, List<List<Integer>> graph) {
        Queue<Pair> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];

        // Start BFS from u
        queue.offer(new Pair(u, -1)); // -1 indicates no parent for the starting node

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int node = pair.node;
            int parent = pair.parent;

            // If this node has already been visited, skip it
            if (visited[node]) continue;

            // Mark the current node as visited
            visited[node] = true;

            // Explore neighbors
            for (int neighbor : graph.get(node)) {
                // Skip the edge (u, v) we want to ignore
                if ((node == u && neighbor == v) || (node == v && neighbor == u)) continue;

                // If we revisit a visited node which is not the parent, we found a cycle
                if (visited[neighbor]) {
                    return true; // Cycle detected
                }

                // If the neighbor is not visited, mark it and continue the search
                queue.offer(new Pair(neighbor, node));
            }
        }
        return false; // No cycle detected
    }
}
