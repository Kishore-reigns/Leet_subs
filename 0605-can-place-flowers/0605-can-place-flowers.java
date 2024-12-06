class Solution {
    public boolean canPlaceFlowers(int[] flower, int n) {
        
        
        int m = flower.length ; 
        
        for(int i = 0 ; i < m ; i++){
            if(flower[i] == 0 && ( i == 0 || flower[i-1] == 0 ) && (i == m-1 || flower[i+1] == 0)){
                n-- ; 
                flower[i] = 1 ; 
            }
            if(n <= 0)return true ; 
        }

        return n<=0 ; 
    }
}