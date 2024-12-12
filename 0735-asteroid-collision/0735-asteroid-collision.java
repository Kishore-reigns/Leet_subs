class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length ; 
        Stack<Integer>stack = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            int ast = asteroids[i] ;
            if(stack.isEmpty())stack.push(ast);
            else{
                int top = stack.peek() ;
                if( (top < 0 && ast < 0) || (top > 0 && ast > 0) || (top < 0 && ast > 0) ){
                    stack.push(ast);
                }else{
                    // && !(top < 0 && ast < 0) || !(top > 0 && ast > 0)
                    while( ast != Integer.MIN_VALUE && !stack.isEmpty() && ast < 0 && stack.peek() > 0  ){
                        top = stack.peek() ; 
                        if(Math.abs(top) < Math.abs(ast)){
                              stack.pop() ; 
                        }
                        else if ( Math.abs(top) == Math.abs(ast)){
                              ast = Integer.MIN_VALUE ; 
                              stack.pop();
                          
                        }else{
                            ast = Integer.MIN_VALUE ; 
                            break ; 
                        } 
                        
                    }

                    if(ast != Integer.MIN_VALUE)stack.push(asteroids[i]);
                    
                }
               
            }
        }
        
        int i = stack.size() ; 
        if(i == 0)return new int[]{} ; 
        int[] res = new int[i] ;
        while(!stack.isEmpty()){
            res[--i] = stack.pop() ; 
        }
        return res ; 
        
    }
}