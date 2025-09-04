class Pair{
    String s ; int val ; 
    public Pair(String s , int val){
        this.s = s ; 
        this.val = val ; 
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        HashMap<String,Integer>map = new HashMap<>();
        PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->{
            if(a.val == b.val)return a.s.compareTo(b.s); 
            return b.val - a.val ; 
        });

        for(String s : words)map.put(s,map.getOrDefault(s,0)+1);

        for(Map.Entry<String,Integer>e : map.entrySet()){
            queue.offer(new Pair(e.getKey(),e.getValue()));
        }

        while( k > 0){
            res.add(queue.poll().s);
            k-- ;
        }

      
        return res ; 
    }
}