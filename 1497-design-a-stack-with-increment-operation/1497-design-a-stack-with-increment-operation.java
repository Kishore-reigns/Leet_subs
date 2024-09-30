class CustomStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    int maxSize , top = 0 , top2 = 0 ; ; 

    public CustomStack(int maxSize) {
        this.maxSize = maxSize ; 
    }
    
    public void push(int x) {
        if(top < maxSize){
            stack.push(x);
            top++ ; 
        }
    }
    
    public int pop() {
        int n = -1 ; 
        if(!isEmpty()){
            top-- ; 
             n = stack.pop() ; 
             
        }
        return n  ; 
    }
    
    public void increment(int k, int val) {
        int count = Math.min(k,top);
        while(!stack.isEmpty()){
            temp.push(stack.pop());
            top-- ; 
            //top2++ ; 
        }
        for(int i = 0 ; i < count ; i ++){
            stack.push(temp.pop() + val);
            top++ ; 
        }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
            top++ ; 
        }
        

    }

    public boolean isEmpty(){
       
        return top == 0 ;
    }
    public boolean isFull(){

        return top == maxSize ; 
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */