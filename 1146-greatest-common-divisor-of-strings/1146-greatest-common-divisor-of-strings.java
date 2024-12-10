class Solution {
    public String gcdOfStrings(String s, String t) {
        /*
        StringBuilder res = new StringBuilder();
        StringBuilder prefix = new StringBuilder();
        StringBuilder str = new StringBuilder();
        
        if(m > n)return "";
        while( i < m ){
            if(s.charAt(i) == t.charAt(i)){
                prefix.append(s.charAt(i));
                int l = prefix.length() ; 
                str = new StringBuilder(prefix.toString().repeat(n/l));
               
                if(str.toString().equals(s)){
                    res = new StringBuilder(prefix); 
                }     
            }
            i++ ; 
        }

        return res.toString() ; 
        */
        int n = s.length() , m = t.length() , i = 0; 
        if( !(s+t).equals(t+s) )return "";
        int length = gcd(n,m);
        return s.substring(0,length);
    }
    public int gcd(int a , int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}