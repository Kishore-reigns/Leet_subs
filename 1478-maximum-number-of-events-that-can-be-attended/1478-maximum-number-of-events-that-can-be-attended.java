class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a,b)->Integer.compare(a[0],b[0]));
        int n = events.length ; 
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        int count = 0 , day = 0, i = 0; 
        while(i < n || !queue.isEmpty()){
            if(queue.isEmpty()){
                day = events[i][0];
            }

            while(i < n && events[i][0] <= day){
                queue.offer(events[i][1]);i++;
            }

             
            

            while(!queue.isEmpty() && queue.peek() < day){
                queue.poll();
            }

            if (!queue.isEmpty()) {
                queue.poll();
                count++;
            }
            
            day++ ;
        }

        return count ; 
        
       
       
    }
}