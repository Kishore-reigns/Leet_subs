class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
    
         for(int i = 0 ; i < magazine.length() ; i++){
            char c = magazine.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        
        for(int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);
            if(!map2.containsKey(c) || map2.get(c) == 0)return false ;
            map2.put(c,map2.get(c) -1 ); 
        }
        return true ; 
    }
}