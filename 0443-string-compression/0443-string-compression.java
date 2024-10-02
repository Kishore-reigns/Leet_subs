class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder() ; 

        char prev = chars[0] ;
        int count = 1 , i = 1; 
        for( i = 1 ; i < chars.length ; i++){
            if(chars[i] == prev){
                count++ ; 
            }else{
                if(count == 1){
                    s.append(prev);
                }else{
                    s.append(prev);
                    s.append(count);
                }
                count = 1 ; 
                prev = chars[i] ; 
            }
        }

        if(count == 1)s.append(prev);
        else {
            s.append(prev);
            s.append(count);
        }
        


        for( i = 0 ; i < s.length()  ;i++){
            chars[i] = s.charAt(i) ; 
        }
        
        return s.length() ; 
    }
}