class Solution {
    public String largestGoodInteger(String s) {
        int count = 1 , n = s.length(); 
        char max = '0';
        for(int i = 1 ; i < n ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                if(count == 3 && s.charAt(i) > max){
                    max = s.charAt(i);
                }
            }else{
                count = 1 ; 
            }

        }
        if(max == '0' && !s.contains("000"))return "";
        return new String(new char[]{max,max,max});
    }
}