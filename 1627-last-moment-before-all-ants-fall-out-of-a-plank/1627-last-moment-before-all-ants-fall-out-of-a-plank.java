class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftmax = (left.length != 0)?Arrays.stream(left).max().getAsInt() : 0 ;
        int rightmin =(right.length != 0)?Arrays.stream(right).min().getAsInt() : n;
        return Math.max( leftmax , n-  rightmin); 
    }
}