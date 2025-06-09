class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length() , n2 = s2.length() ; 
        if(n2 < n1)return false ; 
        int[]f1 = new int[26];
        int[]f2 = new int[26]; 
        for(int i = 0 ; i < n1 ; i++){
            f1[s1.charAt(i)-'a']++ ;
            f2[s2.charAt(i)-'a']++ ; 
        }
        int l = 0 , r = n1 ; 
      
        if(Arrays.equals(f1,f2))return true ; 
        while(l < n2-n1){
            f2[s2.charAt(l)-'a']-- ; 
            f2[s2.charAt(r)-'a']++ ;
            l++ ; r++ ; 
            if(Arrays.equals(f1,f2))return true ; 
        }
        return false ; 


    }
}