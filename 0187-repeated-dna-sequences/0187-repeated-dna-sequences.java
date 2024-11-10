class Solution {
    public List<String> findRepeatedDnaSequences(String str) {
        HashMap<String,Integer>map = new HashMap<>();
        int n = str.length() , k = 10 ; 
        HashSet<String> res = new HashSet<>() ; 
        for(int i = 0 ; i <= n-k ; i++){
            StringBuilder s = new StringBuilder(str.substring(i,i+10));
                map.put(s.toString(),map.getOrDefault(s.toString(),0)+1);
                if(map.get(s.toString()) > 1)res.add(s.toString());
        }
        return new ArrayList<>(res) ; 
    }
}