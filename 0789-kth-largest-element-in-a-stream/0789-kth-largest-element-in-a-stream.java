class KthLargest {
    int k , count = 0; 
    PriorityQueue<Integer> queue ; 
    public KthLargest(int k, int[] nums) {
        this.k = k ;

        queue = new PriorityQueue<>();
        for(int n : nums){
            queue.add(n);
            count++ ; 
            
        }
    }
    
    public int add(int val) {
        queue.add(val);
        count++ ; 
        while(count > k){
            queue.poll() ; 
            count-- ; 
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */