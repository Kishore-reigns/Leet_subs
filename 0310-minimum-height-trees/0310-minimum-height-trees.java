class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1)return new ArrayList<>(Arrays.asList(0));
        List<Integer>res = new ArrayList<>() ; 
        List<List<Integer>>graph = new ArrayList<>();
        int[] indeg = new int[n];
        Queue<Integer>queue =new LinkedList<>();

        for(int i =0  ; i < n ; i++)graph.add(new ArrayList<>());

        for(int[] e : edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
            indeg[e[0]]++ ; indeg[e[1]]++ ;
        }

        for(int i = 0 ; i < n ; i++)if(indeg[i] == 1)queue.offer(i);

        while(!queue.isEmpty()){

            if(n <= 2)break ;
            int size =  queue.size() ; 
            for(int i = 0 ;i < size ; i++){
                int node = queue.poll() ; 
                n-- ; 
                for(int neigh : graph.get(node)){
                    indeg[neigh]-- ; 
                    if(indeg[neigh] == 1)queue.offer(neigh);
                }
            }
            
            
        }

        res.addAll(queue);
        return res ; 


    }
}