class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k )return false ; 
        int arr[] = new int[26]; int odd = 0 ;  
        for(char c : s.toCharArray())arr[ c -'a']++;
        for(int i = 0 ; i < 26 ; i++)if(arr[i]%2 != 0)odd++ ; 
        if(odd > k)return false ; 
        return true ; 
    }
}