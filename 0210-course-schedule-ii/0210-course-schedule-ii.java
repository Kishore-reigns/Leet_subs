class Solution {
    public int[] findOrder(int n, int[][] pre) {
        List<Integer>ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer>queue  = new LinkedList<>();

        for(int i = 0 ; i < n ; i++)adj.add(new ArrayList<>());

        for(int i = 0 ; i < pre.length; i++){
            adj.get(pre[i][1]).add(pre[i][0]);
        }
        int in[] = new int[n] ; 
        for(int i = 0 ; i < n ; i++){
            for(int nei : adj.get(i)){
                in[nei]++ ; 
            }
        }

        for(int i = 0 ; i < n; i++){
            if(in[i] == 0)queue.offer(i);
        }

        while(!queue.isEmpty()){
            int node = queue.poll() ; 
            ans.add(node);
            for(int i : adj.get(node)){
                in[i]-- ; 
                if(in[i] == 0)queue.offer(i);
            }
        }

        if(ans.size() != n)return new int[0];

        int res[] = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++)res[i] = ans.get(i) ; 
        return res; 

        
    }
}