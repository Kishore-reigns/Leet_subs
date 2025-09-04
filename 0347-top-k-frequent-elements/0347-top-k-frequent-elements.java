class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        PriorityQueue<int[]>queue = new PriorityQueue<>((a,b)->{return b[1]-a[1];});
        int[] result = new int[k];
        int j = 0 ; 
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            queue.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        while(k > 0){
            result[j++] = queue.poll()[0] ; 
            k-- ; 
        }

        return result ; 
    }
}