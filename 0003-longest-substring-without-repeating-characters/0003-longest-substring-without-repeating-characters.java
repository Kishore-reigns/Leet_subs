class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>() ; 
        int l = 0 , r = 1 , max = 1 , n = s.length(); 
        if(n == 0)return 0 ; 
        if(n == 1)return 1 ; 
        map.put(s.charAt(0),0);
        
        while( r < n){
            char c = s.charAt(r);
            if(map.containsKey(c))l = Math.max(map.get(c)+1,l);
               
            max = Math.max(max,r-l+1);
            map.put(c,r);
            r++;
        }
        return max ; 
    }
}