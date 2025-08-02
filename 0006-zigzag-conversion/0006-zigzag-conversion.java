class Solution {
    public String convert(String s, int numRows) {
            int len = s.length();
         if(numRows == 1 || len <= numRows)return s ; 
        StringBuilder str = new StringBuilder("");
    
       
        for(int row = 0 ; row < numRows ; row++){
            int increment = 2 * (numRows -1);
            for(int i = row ; i < len ; i += increment){
                str.append(s.charAt(i));
                if(row > 0 && row < numRows - 1 && (i + increment - 2 * row) < len ){
                    str.append(s.charAt(i+increment -  2 * row));
                }
            }
            
        }
        return str.toString();
    }
}