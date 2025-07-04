class Solution {
    public int trap(int[] height) {
        int n = height.length , res = 0 ;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = height[0];
       
        suf[n-1] = height[n-1];
        for(int i = 1 ; i < n ; i++)pre[i] = Math.max(pre[i-1],height[i]);
        for(int i = n-2 ; i>-1;i--)suf[i] = Math.max(suf[i+1],height[i]);

        for(int i = 0 ; i < n ; i++){
            res += Math.abs(Math.min(pre[i],suf[i]) - height[i]);
        }
        return res ; 

    }
}