class Solution {
    public int maxArea(int[] height) {
        int i = 0 ; 
        int j = height.length - 1 ;
        int maxi = 0 ; 
        while( i < j){
            int area = Math.min(height[i],height[j]) * ( j - i );
            maxi = Math.max(maxi , area);
            if( height[i] < height[j] )i++;
            else j--;
        } 
        return maxi ; 
    }
}