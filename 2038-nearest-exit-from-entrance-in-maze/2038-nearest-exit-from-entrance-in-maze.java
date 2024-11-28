class Pair{
    int x , y , dist ; 
    public Pair(int x , int y , int dist){
        this.x = x ;
        this.y = y ; 
        this.dist = dist ; 
    }
}

class Solution {

    int mini = Integer.MAX_VALUE ; 
    int[]x = {1,-1,0,0};
    int[]y = {0,0,1,-1};

    public int nearestExit(char[][] maze, int[] entrance) {
        
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(entrance[0],entrance[1],0));
        maze[entrance[0]][entrance[1]] = '+' ; 

        while(!queue.isEmpty()){
            Pair pair = queue.poll() ;
            int i = pair.x , j = pair.y , dist = pair.dist ;  

            for(int k = 0 ; k < 4 ; k++){
                int u = i+x[k] , v = j+y[k] ; 

                 if( (i==0 || j == 0 || i == maze.length-1 || j == maze[0].length-1) && dist !=0 ){
                    mini = Math.min(dist,mini);
                } 
                if( u >= 0  && v >= 0 && u < maze.length && v < maze[0].length && maze[u][v] == '.' ){
                   maze[u][v] = '+' ; 
                   queue.offer(new Pair(u,v,dist+1));
                }
             }
    
        }
        if(mini >= Integer.MAX_VALUE / 2)return -1 ; 
        return mini ; 
    }

    public void helper(int i , int j ,int dist , char[][]maze ){

        if(maze[i][j] == '+')return ; 

        if( (i==0 || j == 0 || i == maze.length-1 || j == maze[0].length-1) && dist !=0 ){
            mini = Math.min(dist,mini);
            return ; 
        }

        maze[i][j] = '+' ; 
        for(int k = 0 ; k < 4 ; k++){
            int u = i+x[k] , v = j+y[k] ; 
            if( u >= 0  && v >= 0 && u < maze.length && v < maze[0].length && maze[u][v] == '.' ){
                  helper(u,v,dist+1,maze);
            }
        }

        maze[i][j] = '.' ; 
        
    }
}