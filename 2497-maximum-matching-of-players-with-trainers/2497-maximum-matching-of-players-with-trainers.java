class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int res = 0 , i = 0 , j = 0 ; 
        int n = players.length , m = trainers.length ; 
        while(i < n && j < m){
            if(players[i] <= trainers[j]){
                i++;j++;res++;
            }else j++;
        }
        return res ; 
    }
}