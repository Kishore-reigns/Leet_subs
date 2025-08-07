class Solution {
    public int minCostConnectPoints(int[][] p) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[1]-b[1]);
        Set<Integer> set = new HashSet<>();
        Map<Integer,List<int[]>> graph = new HashMap<>();
        int n = p.length , val = 0; 

        for(int i = 0 ; i < p.length ; i++ ){
            graph.putIfAbsent(i,new ArrayList<>());
            for(int j = 0 ; j < p.length ; j++){
                if(i != j)graph.get(i).add(new int[]{j,Math.abs(p[i][0] - p[j][0]) + Math.abs(p[i][1] - p[j][1])});
            }
        }

        queue.offer(new int[]{0,0});
        
        while(set.size() < n){
            
            
            int[] node = queue.poll();
            if(set.contains(node[0]))continue ; 
            val += node[1];
            set.add(node[0]);

            for(int[] neigh : graph.get(node[0])){
                if(!set.contains(neigh[0])){
                    queue.offer(new int[]{neigh[0],neigh[1]});
                }
            }
        }

        return val ;


    }
}