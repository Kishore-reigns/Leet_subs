class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0 ; 
        for(int i = 0 ; i < jewels.length() ; i++){
            char c = jewels.charAt(i);
            for(char s : stones.toCharArray()){
                if(c == s)res++ ; 
            }
        }
        return res ; 
    }
}