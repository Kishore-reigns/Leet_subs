class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    
       HashMap<String , Integer>map = new HashMap<>() ; 
       List<String>res = new ArrayList<>();
        String[] ar1 = s1.split(" ");
        String[] ar2 = s2.split(" ");
        for( String s : ar2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : ar1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : map.keySet()){
            if(map.get(s) == 1)res.add(s);
        }
        return res.toArray(new String[0]);

      

        

    }
}