class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int r = 0 , l = 0 , n = nums.length , i = 0 ;
        int[] result = new int[n-k+1];
        Deque<Integer> queue = new LinkedList<>() ;

   
        while(r < n){
            while(!queue.isEmpty() && nums[r] > nums[queue.getLast()]){
                queue.removeLast();
            }
            queue.addLast(r);

            if(l > queue.getFirst() )queue.removeFirst() ; 

            if(r+1 >= k){
                result[i++] = nums[queue.getFirst()];
                l++ ; 
            }

            r++ ; 
        }
       

       return result ; 
    }
}