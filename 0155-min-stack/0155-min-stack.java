class Node{
    int val ; 
    Node next ; 
    int min ; 
    public Node(int val){
        this.val = val ; 
        this.next = null ;
        this.min = val ; 
    }
}

class MinStack {
    Node top = null ; 
    int min = Integer.MAX_VALUE ; 
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top == null){
           top = new Node(val);
        }else{
            Node temp = new Node(val);
            temp.next = top ; 
            top = temp ; 
        }

        if(top.min < min)min =top.val ;
        top.min = min ;
    }
    
    public void pop() {
       
             top = top.next ; 
             if(top != null)min = top.min ; 
             else min = Integer.MAX_VALUE ; 
        
       
    }
    
    public int top() {
        return top.val ; 
    }
    
    public int getMin() {
        return min ; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */