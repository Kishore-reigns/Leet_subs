class MedianFinder {
    private List<Integer>list ; 
    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i = 0 ; 
        while(i < list.size()){
            if(num >= list.get(i))i++;
            else break ; 
        }
        list.add(i,num);
    }
    
    public double findMedian() {
      
        int size = list.size();

        if(size%2!=0)return list.get(size/2);
        else{
            int mid = size/2 ; 
            return (list.get(mid) + list.get(mid -1)) / 2.0 ; 
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */