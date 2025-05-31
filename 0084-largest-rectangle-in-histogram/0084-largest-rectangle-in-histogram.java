class Pair{
    int index , num ; 
    public Pair(int index , int num){
        this.index = index ; 
        this.num = num ; 
    }
}
class Solution {

    public int largestRectangleArea(int[] h) {
        Stack<Pair> stack = new Stack<>();
        int maxi = -1 , n = h.length;
        stack.push(new Pair(0,h[0]));
        for(int i = 1 ; i < n ;i++){
            int newindex = i ; 
            while(!stack.isEmpty() && stack.peek().num > h[i]){
                Pair pair = stack.pop(); 
                newindex = pair.index;
                maxi = Math.max(maxi, pair.num*(i-pair.index));
            }
            stack.push(new Pair(newindex,h[i]));
        }
        while(!stack.isEmpty()){
            Pair pair = stack.pop() ; 
            maxi = Math.max(maxi , pair.num*(n - pair.index));
        }

        return maxi ; 
    }
}