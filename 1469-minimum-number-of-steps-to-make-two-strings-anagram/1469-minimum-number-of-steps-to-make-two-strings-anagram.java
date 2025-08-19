class Solution {
    public int minSteps(String s, String t) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int count = 0 ; 
        for(char c : s.toCharArray())f1[c-'a']++ ; 
        for(char c : t.toCharArray())f2[c-'a']++ ;

        for(int i = 0 ; i < 26 ; i++){
            if(f1[i] < f2[i]){
                count += Math.abs(f1[i] - f2[i]);
            }
        }

        return count ; 
    }
}