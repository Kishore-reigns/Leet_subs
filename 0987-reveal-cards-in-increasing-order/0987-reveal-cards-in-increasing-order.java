class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<>();
        int n = deck.length ; 
        int[] res = new int[n];
        for(int i = 0 ; i < n ;i++)queue.offer(i);
        int i = 0 ; 
        Arrays.sort(deck);
        while(!queue.isEmpty()){
            int ind = queue.poll() ; 
            res[ind] = deck[i++];
            if(queue.isEmpty())break ; 
            queue.offer(queue.poll()); 
        }

        return res ; 
    }
}