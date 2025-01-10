class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>() ; 
        int n = words1.length , m = words2.length , count = 0 ; 
        boolean universal = true ; 
        int[] maxi = new int[26] ;
        for(int i = 0 ; i < m; i++){
            int[] temp = new int[26];
            for(char c : words2[i].toCharArray())temp[c - 'a']++ ; 
            for(int j = 0 ; j< 26 ; j++){
                maxi[j] = Math.max(maxi[j],temp[j]);
            }
        }
        for(int i = 0 ;i < n ; i++){
            int[]temp = new int[26] ; 
            universal = true ; 
            for(char c : words1[i].toCharArray())temp[c-'a']++;
            for(int j = 0 ; j < 26 ; j++){
                if(temp[j] < maxi[j])universal = false ; 
            }

            if(universal)list.add(words1[i]);
            
        }
        return list ; 
    }
}