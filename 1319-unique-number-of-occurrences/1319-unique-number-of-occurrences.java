class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>() ; 

        for(int n : arr){
                map.put(n,map.getOrDefault(n,0)+1);
        }
        Set<Integer>set = new HashSet<>() ; 
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            int key = entry.getKey() , value = entry.getValue() ; 
            if(set.contains(value))return false ; 
            set.add(value);
        }
        return true ; 
    }
}