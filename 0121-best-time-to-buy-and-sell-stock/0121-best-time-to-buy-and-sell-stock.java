class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 , r = 1 , max = 0; 
        int n = prices.length ; 
        
        while( r < n ){
            if(prices[l] < prices[r]){
                max = Math.max(prices[r]-prices[l],max);
            }else{
                l= r ;
            }
            r++ ; 
        }
        return max ; 
    }
}