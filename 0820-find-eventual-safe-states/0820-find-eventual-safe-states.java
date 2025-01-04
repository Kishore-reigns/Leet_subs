class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length ;
        int[] indeg = new int[n] ; 
        Queue<Integer>queue = new LinkedList<>();
        ArrayList<Integer>res = new ArrayList<>();
        List<List<Integer>>adj = new ArrayList<>(); 
        for(int i = 0 ; i < n  ; i++){
            adj.add(new ArrayList<>());
        }
        // storing in reverse order ; 
        for(int i = 0 ; i < n ; i++){
            for(int j : graph[i]){
                    adj.get(j).add(i);
                    indeg[i]++ ;   
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(indeg[i] == 0){
                queue.offer(i);
                res.add(i);
            }
        }

        while(!queue.isEmpty()){
            int node = queue.poll() ; 
            for(int i : adj.get(node)){
                indeg[i]-- ; 
                if(indeg[i]==0){
                    res.add(i);
                    queue.offer(i);
                }
            }
        }
        Collections.sort(res);
       
        return res ; 
        

    }
}