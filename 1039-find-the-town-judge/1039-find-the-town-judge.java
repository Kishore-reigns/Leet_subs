class Solution {
    public int findJudge(int n, int[][] trust) {
    
        int[] indegree = new int[n+2] ; 
        int[] outdegree = new int[n+2] ; 

        for(int[] arr : trust){
            int a = arr[0] , b = arr[1] ; 
            indegree[b]++ ; 
            outdegree[a]++ ;  
        }

        for(int i = 1 ; i <= n ; i++ ){
            if(outdegree[i] == 0 && indegree[i] == n-1)return i ; 
        }

        return -1 ; 
    }
}