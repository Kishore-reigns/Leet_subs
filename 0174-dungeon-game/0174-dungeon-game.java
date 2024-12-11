class Pair{
    int x , y , health ; 
    public Pair(int x , int y , int health){
        this.x = x ; this.y = y ; this.health = health ; 
    }
}

/*    int n = dungeon.length , m = dungeon[0].length ; 
        PriorityQueue<Pair> queue = new PriorityQueue<>() ; 
        queue.offer( new Pair(0,0,dungeon[0][0]));
        
        int x[] = {0,1} , y[] = {1,0};

        while(!queue.isEmpty()){
            Pair pair = queue.poll() ;
            int i = pair.x , j = pair.y , heal = pair.health ; 
            if(i == n-1 && j == m-1 )return -1*heal+dungeon[i][j]+1 ; 
            for(int k = 0 ; k < 2 ; k++){
                int u = i+x[k] , v = j+y[k] ; 
                if( u >= 0 && u < n && v >= 0 && v < m ){
                    queue.offer(new Pair(u,v,heal+dungeon[u][v]));
                }
            }
        }
        return 1 ; 
    } */

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length , m = dungeon[0].length ; 
        int[][] dp = new int[n][m] ;
        for(int i = 0 ; i < n ; i++)Arrays.fill(dp[i],-1);
        return helper(0,0,n,m,dungeon,dp); 
    }

    public int helper(int i , int j ,int n , int m ,int[][] dung, int[][] dp){

        
        if(i == n-1 && j == m-1)return Math.max(1,1-dung[i][j]); 
        if(dp[i][j] != -1)return dp[i][j] ; 

        int down = Integer.MAX_VALUE , right = Integer.MAX_VALUE ; 
        
        if( i+1 < n){
             down = helper(i+1,j,n,m,dung,dp);
        }
        if( j+1 < m){
             right = helper(i,j+1,n,m,dung,dp);
        }
        
        int mini = Math.min(right,down) - dung[i][j];
    
        return dp[i][j] = Math.max(1,mini);


    }
}