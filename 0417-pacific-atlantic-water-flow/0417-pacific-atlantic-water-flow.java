class Cell{
    int i , j ; 
    public Cell(int i , int j){
        this.i = i ; 
        this.j = j ; 
    }
}

class Solution {

    private int[][] directions = { {0,1} , {0,-1}, {1,0}, {-1,0}} ; 

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length , m = heights[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        List<List<Integer>>res = new ArrayList<>() ; 

        for(int i = 0 ; i < n ; i++){
            dfs(i,0,pacific,heights);
            dfs(i,m-1,atlantic,heights);
        }

        for(int i = 0 ; i < m ; i++){
            dfs(0,i,pacific,heights);
            dfs(n-1,i,atlantic,heights);
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(new ArrayList<>(List.of(i,j)));
                }
            }
        }

        return res ; 


    }

    public void dfs(int i , int j, boolean[][] ocean, int[][] heights){
        
        ocean[i][j] = true ; 

        for(int[] d : directions){
            int u = i + d[0] , v = j + d[1] ; 

            if(u >= 0 && u < heights.length && v >= 0 && v < heights[0].length
                && ocean[u][v] == false && heights[u][v] >= heights[i][j] 
            ){
                dfs(u,v,ocean,heights);
            }

        }
        
    }
}