class Solution {
    public int mySqrt(int x) {
        if(x == 1 )return 1 ; 
        int left = 1 , right = x/2 ; 
        int ans = 0 ; 
        while( left <= right){
            int mid = (left+right) / 2 ; 
            if((long)mid*mid == x)return mid ; 
            if((long)mid*mid < x){
                left = mid + 1 ; 
                ans = mid ; 
            }else right = mid - 1 ; 
        }
        return ans ; 
    }
}