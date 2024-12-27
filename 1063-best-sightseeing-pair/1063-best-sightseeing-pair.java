class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int i = 0 , n = values.length , max = Integer.MIN_VALUE, res = 0 , m = values[0]; 
        for(int j = 1 ; j < n ; j++){
                res = m + values[j] - j ; 
                max = Math.max(max,res);
                if(values[j] + j > m){
                    m = values[j] + j ; 
                } 
        }
        return max ; 
    }
}