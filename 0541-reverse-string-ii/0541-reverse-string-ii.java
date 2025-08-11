class Solution {
    public String reverseStr(String s, int k) {
      
        int n = s.length() , i = 0 ; 
        int l =0 , r = 0 ; 
        if(n <= 1)return s ; 

        for(r = 0 ; r < n ; r+= 2*k){
                l = Math.min(r+k-1,n-1);
                s = reverse(s,r,l);
                
            }
            
    
        return s;
    }

    public String reverse(String s , int i , int j){
 
        char[] c = s.toCharArray();
        while(i < j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp ; 
            i++ ; j--;
        }
        return new String(c);
    }
}