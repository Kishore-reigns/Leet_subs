class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length ; 
        if(n == 0)return new int[0] ; 
        if(k == 1)return nums ; 
        int[] res = new int[ n-k+1];
        Deque<Integer> q = new LinkedList<>() ; 
        
        for(int i = 0 ; i < n ; i++){

            while( !q.isEmpty() && q.peekFirst() < i-k+1){
                q.pollFirst();
            }

            while( !q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }

            q.offerLast(i);

            if( i >= k-1){
                res[i-k+1] = nums[q.peekFirst()] ; 
            }
        }
        return res ; 
    }
}