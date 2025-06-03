class Point{
    int x , y ; 
    double dist ; 
    public Point(int x , int y , double dist){
        this.x = x ; 
        this.y = y ; 
        this.dist = dist ; 
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point>queue = new PriorityQueue<>((x,y)->Double.compare(x.dist,y.dist));
        int[][]res = new int[k][2];
        int i = 0 ; 

        for(int[] point : points){
            int x = point[0] , y = point[1];
            double dist = Math.sqrt( x*x +  y*y);
            queue.add(new Point(x,y,dist));
        }

        while(k-- > 0){
            Point point = queue.poll() ; 
            res[i][0] = point.x ; 
            res[i++][1] = point.y ; 
        }

        return res ; 

    }
}