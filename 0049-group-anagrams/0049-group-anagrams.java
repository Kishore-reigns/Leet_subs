class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(str);
        }
        for(List<String>list : map.values()){
            res.add(list);
        }
        return res ; 
        
    }

    public boolean isAnagram(String a , String b){
        HashMap<Character,Integer>map = new HashMap<>();
        if(a.length() != b.length() )return false ;
        for(int i = 0 ; i < a.length() ; i++){
            char c = a.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0 ; i < b.length() ; i++){
            char c = b.charAt(i);
            if(!map.containsKey(c) || map.get(c) == 0)return false ; 
            map.put(c,map.get(c)-1);
        }
        for(Integer it : map.values()){
            if(it != 0)return false ; 
        }
        return true ; 
    }
}