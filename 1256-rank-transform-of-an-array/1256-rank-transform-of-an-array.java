class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length ; 
        int[]rank = new int[n];
         PriorityQueue<Integer>queue = new PriorityQueue<>() ; 
         for(int x : arr)queue.offer(x);
         HashMap<Integer,Integer>map = new HashMap<>();
         int r = 1 ; 
         while(!queue.isEmpty()){
            int x = queue.poll() ; 
            if(!map.containsKey(x)){
                map.put(x,r);
                r++ ; 
            }
         }
         for(int i = 0 ; i < n ;i++){
            rank[i] = map.get(arr[i]);
         }
         return rank ; 


    }
}