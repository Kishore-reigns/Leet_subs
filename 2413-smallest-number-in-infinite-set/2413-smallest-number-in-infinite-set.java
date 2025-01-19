class SmallestInfiniteSet {

    PriorityQueue<Integer> minheap = null ; 

    public SmallestInfiniteSet() {
        minheap = new PriorityQueue<>(); 
        for(int i = 1 ; i <= 1000 ; i++)minheap.add(i);
    }
    
    public int popSmallest() {
        return minheap.poll();
    }
    
    public void addBack(int num) {
        if(!minheap.contains(num))minheap.offer(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */