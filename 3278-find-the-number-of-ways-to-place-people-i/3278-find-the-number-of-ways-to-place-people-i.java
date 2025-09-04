class Solution {
    public int numberOfPairs(int[][] points) {
        
        int count = 0 ; 
        int n = points.length ; 

        Arrays.sort(points,(a,b)->{
            if(a[0]==b[0])return b[1] - a[1] ; 
            return a[0] - b[0] ;
        });

        for(int i = 0 ; i < n ;i++){
            int uppery = points[i][1] ; 
            int lowery = Integer.MIN_VALUE ; 
            for(int j = i+1 ; j < n ; j++){
                int currenty = points[j][1];
                if(currenty <= uppery && currenty > lowery){
                    count++ ; 
                    lowery = currenty ; 
                    if(currenty == uppery)break ; 
                }
            }
        }

        return count ; 
    }
}