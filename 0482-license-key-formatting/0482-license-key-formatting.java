class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();
        int count = 0  ; 
        for(int i = s.length() -1 ; i >= 0 ; i--){
            char c = s.charAt(i);
            if( (c >= 'a' && c <='z') || (c>='A' && c <= 'Z')){
                str.append(Character.toUpperCase(c));
                count++ ; 
            }else if( c >= '0' && c <= '9'){
                str.append(c);
                count++ ;
            }

            if(count == k && i > 0){
                count = 0 ; 
                str.append("-");
            }
               
            
        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == '-') {
            str.deleteCharAt(str.length() - 1);
        }

        return str.reverse().toString();
    }
}