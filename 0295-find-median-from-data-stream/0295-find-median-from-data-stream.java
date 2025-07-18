class MedianFinder {
    private PriorityQueue<Integer> small , large ; 
    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder());
        large = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        small.offer(num);

        if(!small.isEmpty() && !large.isEmpty() && small.peek() > large.peek())large.offer(small.poll());
        if(!small.isEmpty() && !large.isEmpty() && large.peek() < small.peek())small.offer(large.poll());

        //balance the size 
        if(small.size() > large.size() + 1)large.offer(small.poll());
        if(large.size() > small.size() + 1)small.offer(large.poll());
    }
    
    public double findMedian() {
      
        if(small.size() == large.size()){
            return (small.peek()+large.peek()) / 2.0 ; 
        }
        if(small.size() > large.size())return small.peek() ; 
        return large.peek() ;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */