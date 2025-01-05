class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length() , op = 0; 
        int[] arr = new int[n+1] ; 
        StringBuilder str = new StringBuilder(s);
        for(int[] shift : shifts){
            int st = shift[0] , end = shift[1] , dir = shift[2] ; 
            op = (dir == 0)? -1 : 1 ; 
            arr[st] += op ; 
            if( end + 1 < n )arr[end+1] -= op ; 
        }
        int cum = 0 ; 
        for(int i= 0 ; i < n ; i++){
            cum += arr[i] ; 
            int ns = (cum %26 + 26) % 26 ;
            str.setCharAt(i, (char) ('a' + ( s.charAt(i) - 'a' + ns)%26 ) );
           
        }

        return str.toString();
    }   
}