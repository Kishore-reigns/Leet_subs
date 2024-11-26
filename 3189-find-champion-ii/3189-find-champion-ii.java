class Solution {
    public int findChampion(int n, int[][] edges) {

        int champcount = 0 , champ = - 1; 
        int[] indegree = new int[n] ; 
        for(int[] edge : edges){
            indegree[edge[1]]++ ; 
        }
        for(int i = 0 ; i < n ; i++){
           if(indegree[i] == 0){
                champ = i ; champcount++ ; 
           }
        }

        if(champcount > 1)return -1 ; 
        return champ ; 

    }
}