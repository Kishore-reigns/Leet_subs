class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->{return b-a;});
        Queue<int[]> queue = new LinkedList<>() ; 
        int[] freq = new int[26];
        int time = 0 ; 
        for(char c : tasks)freq[c-'A']++ ; 
        for(int i : freq){
            if(i > 0)heap.offer(i);
        }

        while(!heap.isEmpty() || !queue.isEmpty()){
            
            time++ ; 
            if(!heap.isEmpty()){
                int rem = heap.poll() -1 ; 
                if(rem > 0)queue.offer( new int[]{rem,time+n});
            }
            
            while(!queue.isEmpty() && queue.peek()[1] <= time){
                heap.offer(queue.poll()[0]);
            }

            if(heap.isEmpty() && !queue.isEmpty() && time < queue.peek()[1]){
                time = queue.peek()[1] -1 ; 
            }
            
        }


        return time ; 

    }
}