class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length ; 
        int[]rank = new int[n];
        int[]sorted = arr.clone();
        Arrays.sort(sorted);
         HashMap<Integer,Integer>map = new HashMap<>();
         int r = 1 ; 
         for(int i = 0 ; i < n ; i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],r++);
               
            }
         }
         for(int i = 0 ; i < n ;i++){
            rank[i] = map.get(arr[i]);
         }
         return rank ; 


    }
}