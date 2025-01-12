class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long succ) {
        int n = spells.length , m = potions.length ; 
        int[] res = new int[n];
        Arrays.sort(potions);
        for(int i = 0 ; i < n ; i++){
            int spell = spells[i] ; 
            int low = 0 , high = m-1 ; 
            int index = -1 ;
            while( low <= high){
                int mid = low + (high - low) / 2 ; 
                if( (long)potions[mid]*spell >= succ){
                    
                    index = mid ; 
                    high = mid -1 ; 
                }else{
                    low = mid + 1 ; 
                }
            }
        
            res[i] = (index!=-1)? m - index  : 0 ; 
        }
        return res ; 
    }
}