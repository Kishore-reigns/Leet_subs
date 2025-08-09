class Solution {
    public int numTrees(int n) {
       if(n <= 0)return 0 ; 

       long binom = 1 ; 
       for(int i = 1 ; i <= n ; i++){
            binom = binom * (n+i)/i ; 
       }

       long cat =  binom / (n+1) ;

       return (int)cat ; 
    }

   
}