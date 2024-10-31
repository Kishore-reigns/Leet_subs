class Solution {
    public int maxVowels(String s, int k) {
        int maxi = 0 ; 
        int vowel = 0 ; 

        for(int i = 0 ; i < k ; i++){
            if(String.valueOf(s.charAt(i)).matches("[aeiou]"))vowel++ ; 
        }
        maxi = Math.max(maxi , vowel);

        for(int i = k ; i < s.length() ; i++){
            
            if(String.valueOf(s.charAt(i-k)).matches("[aeiou]")){
                vowel-- ; 
            }
            if(String.valueOf(s.charAt(i)).matches("[aeiou]")){
                vowel++ ; 
            }

            maxi = Math.max(maxi,vowel);
        }

        return maxi ; 
    }
}