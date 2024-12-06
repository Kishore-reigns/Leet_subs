class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>() ; 
        for(int i : banned){
            if( i <= n ){
                set.add(i);
               
                }
        } 
        int i = 1 , sum = 0 , count = 0 ; 
        while( i <= n && sum <= maxSum ){
            if(!set.contains(i) && sum + i <= maxSum){
                sum += i ; 
                count++ ;
            }
            i++ ; 
        }
        return count ; 
    }
}