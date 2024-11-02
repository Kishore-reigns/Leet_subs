class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer>map = new HashMap<>();
        int count = 0 ; 
        for(int[] n : grid){
            String s = Arrays.toString(n);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(int i = 0 ; i < grid.length ; i++){
            int[] col = new int[grid.length];
            for(int j = 0 ; j < grid.length ; j++){
                col[j] = grid[j][i] ; 
            }
            if(map.containsKey(Arrays.toString(col))){
                count += map.getOrDefault(Arrays.toString(col) ,0 ) ; 
            }
        }


        return count ; 
    }
}