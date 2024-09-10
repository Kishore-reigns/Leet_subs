class Solution {
    public int trap(int[] height) {
        int n = height.length , total = 0 ;
        int[] premax = new int[height.length];
        int[] sufmax = new int[height.length];
        premax[0] = height[0] ; 
        for(int i = 1 ; i < n ; i++){
            premax[i] = Math.max(height[i],premax[i-1]);
        }
        sufmax[n-1] = height[n-1] ; 
        for(int i = n-2 ; i >= 0 ; i--){
            sufmax[i] = Math.max(height[i],sufmax[i+1]);
        }
        for(int i = 0 ;i < n ; i++){
            total += Math.min(premax[i],sufmax[i]) - height[i] ; 
        }

        return total ; 
    }
}