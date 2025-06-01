class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> queue = new PriorityQueue<>((x,y)->{return y-x;});
     for(int i : stones)queue.add(i);

     while(queue.size() >= 2){
        int y = queue.poll() ;
        int x = queue.poll() ; 
        if( x != y)queue.add(y-x); 
     }


     return (!queue.isEmpty())? queue.poll() : 0 ;  
    }
}