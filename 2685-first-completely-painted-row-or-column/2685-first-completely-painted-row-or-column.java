class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length , m = mat[0].length ; 
        HashMap<Integer,int[]> map = new HashMap<>();
        int[] row = new int[n];
        int[] col = new int[m] ; 
        Arrays.fill(row,m);
        Arrays.fill(col,n);
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < m ; j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            int[] pos = map.get(arr[i]);
            row[pos[0]]-- ; col[pos[1]]-- ; 
            if(row[pos[0]] == 0 || col[pos[1]] == 0)return i ; 
        }

        return -1 ; 
    }
}