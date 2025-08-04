class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = fruits.length ; 
        boolean[] took = new boolean[baskets.length];
        for(int i = 0 ; i < fruits.length ; i++){
            for(int j = 0 ; j < baskets.length ; j++){
                if(!took[j] && baskets[j] >= fruits[i]){
                    took[j] = true ; 
                    count-- ; 
                    break ; 
                }
            }
        }
        return count ; 
    }
}