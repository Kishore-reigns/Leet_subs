class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
        int end = Integer.MIN_VALUE , count = 0; 
        for(int[] inter : intervals){
            if(end <= inter[0]){
                end = inter[1];
                count++ ;
               
            }
        }
        return intervals.length - count ; 
    }
}