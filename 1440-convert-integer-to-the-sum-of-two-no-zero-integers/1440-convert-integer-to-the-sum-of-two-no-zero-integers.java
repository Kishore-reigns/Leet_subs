class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1 ; i <= n ; i++){
            if(!String.valueOf(n-i).contains("0") && !String.valueOf(i).contains("0"))return new int[]{n-i,i};
        }

        return new int[]{-1,-1};
    }
}