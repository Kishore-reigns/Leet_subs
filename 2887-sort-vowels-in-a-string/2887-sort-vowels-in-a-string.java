class Solution {
    public String sortVowels(String s) {
        StringBuilder t = new StringBuilder();
        String vowels = "aeiouAEIOU";
        List<Character> vlist = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1)vlist.add(c);
        }

        Collections.sort(vlist);
        int k = 0 ; 
        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                t.append(vlist.get(k++));
            }else{
                t.append(c);
            }
        }

  

        return t.toString();
    }
}