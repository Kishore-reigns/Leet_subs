class Solution {
    double[][] dp ;
    public double soupServings(int n) {
        if( n >= 5000)return 1 ; 
        dp = new double[201][201];
        for(int i = 0 ; i< 201 ; i++)Arrays.fill(dp[i],-1);
        n = (int)Math.ceil(n/25.0);
        return serve(n,n);
    }

    public double serve(int a, int b){

        if(a <= 0 && b > 0)return 1 ; 
        if(a <= 0 && b <= 0)return 0.5 ; 
        if(a > 0 && b <= 0)return 0 ; 

        if(dp[a][b] != -1)return dp[a][b] ; 

        return dp[a][b] = 0.25 * (serve(a-4,b) + serve(a-3,b-1) + serve(a-2,b-2) + serve(a-1,b-3)) ;
    }
}