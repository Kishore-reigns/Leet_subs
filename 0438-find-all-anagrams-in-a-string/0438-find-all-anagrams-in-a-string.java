class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length())
            return res;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int l = 0, r = 0;
        int psize = p.length() ; 
        for (char c : p.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        while (r < s.length()) {
            char c = s.charAt(r);
            map1.put(c,map1.getOrDefault(c,0)+1);

            if( r >= psize){
                char d = s.charAt(r-psize) ;
                map1.put(d,map1.get(d)-1);
                if(map1.get(d) == 0)map1.remove(d);
            }

            if(map1.equals(map2)){
                res.add(r-psize+1);
            }
            r++ ; 
        }

        return res ; 

    }
}