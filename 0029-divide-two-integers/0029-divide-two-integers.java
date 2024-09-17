class Solution {
    public int divide(int dividend, int divisor) {
       
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }
       boolean neg = (dividend < 0) ^ (divisor < 0) ; 
       long d = Math.abs((long)dividend);
       long div = Math.abs((long)divisor);
       long q  =0 ; 
        if(div == 1){
            q = d ; 
            if(neg)q = -q ; 
            return (int)q ; 
        }
       while( d >= div){
            d -= div ; 
            q++ ;
       }

       if(neg)q = -q ; 
       return (int)q ;
    }

    /*

    public void test(){
         String m = Integer.toBinaryString(divisor);
        String q = Integer.toBinaryString(dividend);
        while(q.length() < m.length()){
            q = "0" + q ;
        }
        int n = q.length() ; 
        StringBuilder a = new StringBuilder("0".repeat(n));
        StringBuilder quo = new StringBuilder();
        String aq = a + q ; 

        for( int i = 0 ; i < n ; i++){
            
            a.append(q.charAt(i));

            if( Integer.parseInt(a.toString(),2) >= Integer.parseInt(m,2) ){
                
               int aInt = Integer.parseInt(a.toString(), 2);
                int mInt = Integer.parseInt(m, 2);
                aInt -= mInt;
                a = new StringBuilder(Integer.toBinaryString(aInt));
                while(a.length() < n){
                    a.insert(0,'0');
                }
                quo.append('1');
            }else{
                quo.append('0');
            }
        }

        int res = Integer.parseInt(quo.toString(),2);

       boolean neg = (dividend < 0 ) ^ (divisor < 0) ; 
        if(neg)res = -res ; 

        return res ; 


    }

    */
}