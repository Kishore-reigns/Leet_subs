class StockSpanner {

    Stack<int[]> prim = null; 

    public StockSpanner() {
        prim = new Stack<>() ; 
      
    }
    
    public int next(int price) {
        int res = 1 ; 
        while(!prim.isEmpty() && prim.peek()[0] <= price){
            res += prim.pop()[1];
        }
        prim.push(new int[]{price,res});
        
        return res ;  
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */