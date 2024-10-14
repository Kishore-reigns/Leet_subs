class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>queue = new PriorityQueue<>((x,y)->y-x);
        for(int n : nums){
            queue.offer(n);
        }
        long score = 0 ; 
        for(int i = 0 ; i < k ; i++){
            long val = queue.poll() ;
             
            score += val ; 
            val = (long)(Math.ceil((double)val/3));
           System.out.println(val); 
            queue.offer((int)val);
        }

        return score ; 

    }
}