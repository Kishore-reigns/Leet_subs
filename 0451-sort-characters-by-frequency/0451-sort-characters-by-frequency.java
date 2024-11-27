class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer>map = new TreeMap<>( ) ; 
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>queue = new PriorityQueue<>( (x , y) -> y.getValue() - x.getValue()); 
        queue.addAll(map.entrySet());
        StringBuilder res = new StringBuilder();

        while(!queue.isEmpty()){
            Map.Entry<Character,Integer> entry = queue.poll() ; 
             res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
  
        
        return res.toString();
    }
}