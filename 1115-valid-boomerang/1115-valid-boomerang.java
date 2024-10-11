class Solution {
    public boolean isBoomerang(int[][] p) {
        if(p.length != 3 )return false ; 
        int x1 = p[0][0] , y1 = p[0][1];
        int x2 = p[1][0] , y2 = p[1][1];
        int x3 = p[2][0] , y3 = p[2][1];

        float area = (float)(0.5*(Math.abs( x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))));

        if(area != 0)return true ; 
        return false ; 
    }
}