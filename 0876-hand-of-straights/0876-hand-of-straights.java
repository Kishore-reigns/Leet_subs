class Solution {
    public boolean isNStraightHand(int[] hand, int g) {
        int n = hand.length ; 
        if(n%g != 0)return false ; 
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int v : hand)map.put(v,map.getOrDefault(v,0)+1);

        while(map.size() != 0){
            int first = map.firstKey() ; 
            for(int i = first ; i < first + g ; i++){
                if(!map.containsKey(i))return false; 
                map.put(i,map.get(i) - 1 );
                if(map.get(i) == 0){
                    map.remove(i);
                }
            }
        }
        return true ; 
    }
}