class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size() ; 
        boolean[] visited = new boolean[n];
         
        Queue<Integer>queue = new LinkedList<>() ; 
        queue.offer(0);
        while(!queue.isEmpty()){
            int cur = queue.poll(); 
            visited[cur] = true ; 
            for(int i : rooms.get(cur)){
                if(!visited[i])queue.offer(i);
            }
        }

        for(boolean k : visited){
            if(k == false)return false ; 
        }
        return true ; 
    }
}