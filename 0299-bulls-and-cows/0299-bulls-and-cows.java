class Solution {
    public String getHint(String secret, String guess) {
        int[] f1 = new int[10];
        int[] f2 = new int[10];
        int a = 0 , b = 0 ; 

        for(int i = 0 ; i < guess.length() ; i++){
            char s = secret.charAt(i);
            char t = guess.charAt(i);

            if(s == t)a++ ; 
            else{
                f1[s-'0']++;
                f2[t-'0']++;
            }
        }

        for(int i = 0 ; i < 10 ; i++){
            b += Math.min(f1[i],f2[i]);
        }

        return a+"A"+b+"B";
    }
}