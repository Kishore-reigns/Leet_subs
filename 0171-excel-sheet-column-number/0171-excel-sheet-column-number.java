class Solution {
    public int titleToNumber(String column) {
        /*
            a = 1 
            b = 2
            z = 26

            ab = 28

        */
        int i = 0 , res = 0; 
        while(i < column.length()){
            int c =  column.charAt(i) - 'A' + 1 ; 
            System.out.print(c) ; 
            res = res * 26 + c ;
            i++ ; 
        }
     
        return res ; 

        
    }
}