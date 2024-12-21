class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length , count = 0; 
        Arrays.sort(intervals, (x,y) -> {
            if(x[0] == y[0])return x[1] - y[1] ;
            return x[0] - y[0] ;
        });
        
        int end = intervals[0][1] ; 
        for(int i = 1 ; i < n ; i++){
            if(intervals[i][0] < end){
                count++ ; 
                end = Math.min(end , intervals[i][1]);
            }else{
                end = intervals[i][1] ;
            }
        }

        return count ; 
        
    }
}