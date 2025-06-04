class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];

        int count = 0 ; 
        for(int i = 0 ; i <= n ; i++){
            int x = i ; 
            while(x > 0){
                if((x&1) == 1)count++ ; 
                x = x >> 1 ; 
            }

            res[i] = count ; 
            count = 0 ;
        }
        return res;
    }
}