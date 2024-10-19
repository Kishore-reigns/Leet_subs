class Solution {
    public boolean isUgly(int n) {
        int[] fac = {2,3,5} ; 
        boolean flag = false ; 

        if(n == 1)return true ; 

        while(n >= 0){
            if(n == 1)break ; 
            for(int i = 0 ; i < fac.length ; i++){
                if(n%fac[i] == 0){
                    n /= fac[i] ; 
                    flag = true ; 
                    break ; 
                }
                System.out.println(n);
            }
            if(!flag)return false ; 
            flag = false;
        }

        return true ; 
    }
}