class Solution {
    public int findTheWinner(int n, int k) {
        int count = 1 , ans = -1 ; 
        if(k == 1)return n ; 
        Queue<Integer>queue = new LinkedList<>();
        for(int i = 1 ; i<= n ; i++)queue.offer(i);
        while(!queue.isEmpty()){
            if(count == k){
                count = 1 ; 
                queue.poll() ;
            }else{
                ans = queue.poll() ; 
                queue.offer(ans);
                count++ ; 
            }
        }

        return ans ; 
    }
}