class Solution {
    public int removeCoveredIntervals(int[][] inter) {
        Arrays.sort(inter,(x,y)->{
            if(x[0] == y[0])return y[1] - x[1];
            return  x[0] - y[0];
        });
        int count = inter.length , n = count ;
        int start = inter[0][0] , end = inter[0][1] ;
        for(int i = 1 ; i < n ; i++){
            System.out.println(Arrays.toString(inter[i]));
            if(inter[i][0] >= start && inter[i][1] <= end)count-- ; 
            else{
                start = inter[i][0];
                end = inter[i][1] ; 
            }

        }
        return count ; 
    }
}