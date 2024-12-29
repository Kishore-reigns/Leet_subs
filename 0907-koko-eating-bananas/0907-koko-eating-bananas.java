class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , n = piles.length , high = Arrays.stream(piles).max().getAsInt(); 
        int ans = high ; 
        while(low <= high){
            int mid = (low + high) / 2 ;
            long tot = check(piles,mid);
            if(tot <= h){
                ans = mid ; 
                high = mid - 1 ; 
            }
            else low = mid + 1 ;  
        }

        return ans ; 
    }

    public long check(int piles[] , int hour){
        long total = 0 ; 
        for(int i = 0 ; i < piles.length ; i++){
            total += (long) Math.ceil((double)piles[i] / hour) ; 
        }
        return total ; 
    }
}