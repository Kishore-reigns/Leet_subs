class Tuple{
    int i , j  ; 
    public Tuple(int i , int j){
        this.i = i ; 
        this.j = j ; 
        //this.min = min ; 
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length , m = grid[0].length , res = Integer.MAX_VALUE ; 
        int fresh = 0 , time = 0 ;
        Queue<Tuple> queue = new LinkedList<>() ;
        int[] x = {0,0,1,-1} , y = {1,-1,0,0}; 
        
        for(int i= 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 1)fresh++ ; 
                if(grid[i][j] == 2){
                    queue.offer(new Tuple(i,j));
                }
            }
        }


        while( fresh > 0 && !queue.isEmpty()){
            int size = queue.size() ; 

            for(int i = 0 ; i < size ; i++){
                Tuple cell = queue.poll() ; 

                for(int d = 0 ; d < 4 ; d++){
                    int u = cell.i + x[d] , v = cell.j + y[d] ; 

                    if(u >= 0 && u < n && v >= 0 && v < m){
                        if(grid[u][v] == 1){
                            grid[u][v] = 2 ; 
                            fresh-- ; 
                            queue.offer(new Tuple(u,v));
                        }
                    }
                }

            }

            time++ ; 
        }

        return (fresh == 0)? time : -1 ; 

       
    }

   
}