class Solution {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder(s); 
        while(str.toString().contains("AB") || str.toString().contains("CD")){
            if(str.toString().contains("AB")){
                int i = str.indexOf("AB");
                int j = i+2 ; 
                str.delete(i,j);
            }else if(str.toString().contains("CD")){
                int i = str.indexOf("CD");
                int j = i+2 ; 
                str.delete(i,j);
            }
        }

        return str.length() ; 
    }
}