
class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0 ; int n = gifts.length  ; 
        PriorityQueue<Integer>queue = new PriorityQueue<>( (x,y) -> y - x) ; 
        for(int i = 0 ; i < n ; i++ ){
            queue.offer(gifts[i]);
        }
  
        for(int i = 0 ; i < k ; i++){
            int val = queue.poll() ; 
            val = (int)Math.floor(Math.sqrt(val));
            queue.offer(val); 
             
        }
      
        while(!queue.isEmpty())sum += queue.poll() ; 
        return sum ; 
    }
}