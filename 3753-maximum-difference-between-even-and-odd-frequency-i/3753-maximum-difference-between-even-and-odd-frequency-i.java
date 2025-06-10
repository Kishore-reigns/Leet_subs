class Solution {
    public int maxDifference(String s) {
        int[]freq = new int[26];
        int maxi = -1 , mini = 999 ; 
        for(char c : s.toCharArray()){
            freq[c-'a']++ ; 
        }
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i]%2 != 0 && freq[i] > maxi)maxi = freq[i];
            if(freq[i]!= 0 && freq[i]%2==0 && freq[i] < mini)mini = freq[i];
        }
        return maxi - mini ; 
    }
}