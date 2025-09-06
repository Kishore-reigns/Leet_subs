class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]>q = new LinkedList<>() ; 
        int time = 1 ; 
        for(int i = 0 ; i < tickets.length ; i++)q.offer(new int[]{tickets[i],i});

        while(!q.isEmpty()){

            if(q.peek()[1] == k && q.peek()[0]-1 == 0)return time ; 
            int[] e = q.poll() ; 
            if(e[0]-1 != 0)q.offer(new int[]{e[0]-1,e[1]});
            time++ ; 
        }

        return 0 ; 
    }
}