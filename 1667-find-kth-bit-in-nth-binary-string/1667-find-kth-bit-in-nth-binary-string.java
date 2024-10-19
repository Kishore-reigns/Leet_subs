class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s1 = new StringBuilder("0") ; 
        StringBuilder res = new StringBuilder();
        if(n == 1 && k == 1)return '0';
        for(int i = 2 ; i <=n ; i++){
            res = new StringBuilder(s1).append("1").append(invert(s1).reverse()) ; 
            s1 = res ; 
            //System.out.println(res);
        }
        return res.charAt(k-1) ; 
    }
    
    StringBuilder invert(StringBuilder s){
        StringBuilder in = new StringBuilder(s.length());
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                in.append('0');
            }else{
                in.append('1');
            }
        }
        return in ; 
    }
}