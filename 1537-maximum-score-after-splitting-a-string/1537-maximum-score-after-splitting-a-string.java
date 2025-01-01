class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] one = new int[n+1] ; 
        Arrays.fill(one,0);
        for(int i = n-1 ; i >= 0 ; i--){
            if(s.charAt(i) == '1'){
                one[i] = one[i+1] + 1;
            }else{
                one[i] = one[i+1];
            }
            
        }
        //if(one[0] == s.length())return one[0]-1 ; 
        int zero = 0 , res = -1 ; 
      
        for(int i = 0 ; i < n-1 ; i++){
            if(s.charAt(i) == '0')zero++ ; 
            res = Math.max(res,zero+one[i+1]);
        }
        return res ; 
    }
}