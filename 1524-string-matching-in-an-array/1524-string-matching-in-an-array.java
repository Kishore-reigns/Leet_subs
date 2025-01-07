class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length ; 
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            String w1 = words[i] ;
            for(int j = 0 ; j < n ; j++){
                if(i!=j && words[j].contains(w1) && !list.contains(w1) )list.add(w1);
            }
        }
        return list ; 
    }
}