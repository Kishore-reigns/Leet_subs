class Solution {
    public boolean areSentencesSimilar(String sent1, String sent2) {
        List<String> s1 = Arrays.asList(sent1.split(" "));
        List<String> s2 = Arrays.asList(sent2.split(" "));
        if(sent1.equals(sent2))return true ; 
        int start = 0 , end = 0 ; 
        int s1len = s1.size() , s2len = s2.size();
        List<String> longer = (s1len >= s2len) ? s1 : s2 ;
        List<String> shorter = (s1len < s2len) ? s1 : s2 ; 

        while(start < shorter.size()){
            if(shorter.get(start).equals(longer.get(start))){
                start++ ; 
            }else break ; 
        }

        while( end < shorter.size()){
            if(shorter.get(shorter.size() - end - 1).equals(longer.get(longer.size() - end - 1))){
                end++ ; 
            }else break ; 
        }

        return start + end >= shorter.size() ; 
    }
}