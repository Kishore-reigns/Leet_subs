class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1 ; 
        int max = Integer.MIN_VALUE  ; 
        for(int n : piles){
            max = Math.max(max,n);
        }
        int ans = max ; 
        while(min <= max){
            int mid = (max+min) / 2 ; 
            long hours = 0 ; 
            for(int n : piles){
                hours += (long)Math.ceil((double)n/mid) ; 
            }
            if(hours <= h){
                ans = mid;
                max = mid- 1 ;
            }else min = mid + 1 ; 

        }
        return ans ; 
    }
}