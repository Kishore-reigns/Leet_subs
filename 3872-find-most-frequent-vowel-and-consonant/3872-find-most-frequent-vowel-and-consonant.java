class Solution {
    public int maxFreqSum(String s) {
        String vow = "aeiou";
        int[] vowels = new int[26];
        int[] cons = new int[26];

        for(char c : s.toCharArray()){
            if(vow.indexOf(c) != -1)vowels[c-'a']++;
            else cons[c-'a']++ ; 
        }
        int one = Arrays.stream(vowels).max().getAsInt()  ;
        int two = Arrays.stream(cons).max().getAsInt();

        return one + two  ; 

    }
}