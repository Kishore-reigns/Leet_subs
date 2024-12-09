
class Solution {
    public int maxTwoEvents(int[][] events) {
       
       Arrays.sort(events,(x,y)-> x[1]-y[1]);
       int maxi = 0 , single = 0 ; 
       TreeMap<Integer,Integer>map = new TreeMap<>();
       map.put(0,0);
        for(int[] event : events){
            int start = event[0] , end = event[1] , value = event[2] ;
            Map.Entry<Integer,Integer>entry = map.lowerEntry(start) ;
           int best = (entry != null) ? entry.getValue() : 0;
            maxi = Math.max(maxi , best + value);
            single = Math.max(single,value);
            map.put(end,Math.max(map.getOrDefault(end,0) , single));             
        }
        
       
        return maxi ; 
    }
}