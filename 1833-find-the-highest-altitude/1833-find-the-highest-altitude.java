class Solution {
    public int largestAltitude(int[] gain) {
        int maxi = 0 , alt = 0 ; 
        for(int i = 0 ; i < gain.length ; i++){
            alt += gain[i];
            maxi = Math.max(maxi ,alt );
        }
        return maxi ; 
    }
}