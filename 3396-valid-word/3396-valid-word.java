class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)return false ; 
        int vowel = 0 , cons = 0; 
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c))return false ; 
            if(Character.isLetter(c)){
                if(vowels.contains(c))vowel++;
                else cons++ ; 
            }
            
            
        }

        return (vowel >= 1 && cons >= 1) ; 
    }
}