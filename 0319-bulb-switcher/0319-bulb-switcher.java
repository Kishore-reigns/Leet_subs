class Solution {
    public int bulbSwitch(int n) {
       
       /*
       boolean[] bulbs = new boolean[n+1];
       Arrays.fill(bulbs,false);
       int count = 0 ; 
       for(int i = 1 ; i <= n ; i++){
            for(int j=i ; j <= n ; j+= i){
                bulbs[j] = !bulbs[j] ; 
            }
       }

        for(int i = 1; i <= n ; i++){
            if(bulbs[i] == true)count++ ; 
       }
       */
       return (int)Math.sqrt(n) ; 
    }
}