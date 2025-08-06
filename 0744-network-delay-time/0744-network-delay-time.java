class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> graph = new HashMap<>();

        
        for(int[] t : times){
            graph.putIfAbsent(t[0],new ArrayList<>());
            graph.get(t[0]).add(new int[]{t[1],t[2]});
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((x,y)->x[1]-y[1]);

        queue.offer(new int[]{k,0});
        Set<Integer> set = new HashSet<>();
        int t = 0 ; 

        while(!queue.isEmpty()){
            int[] node = queue.poll();
            if(set.contains(node[0]))continue ; 
            set.add(node[0]);
            
            t = node[1];
            if(graph.containsKey(node[0])){
                for(int[] neigh : graph.get(node[0])){
                    if(!set.contains(neigh[0])){
                      
                        queue.offer(new int[]{neigh[0],neigh[1]+t});
                    }
                }
            }
            
        }


        return set.size() == n ? t : -1 ;
    }
}