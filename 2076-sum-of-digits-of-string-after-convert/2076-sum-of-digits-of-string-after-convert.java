class Solution {
    public int getLucky(String s, int k) {
        int sum = 0 ;
        StringBuilder str = new StringBuilder(); 
        for(int i = 0 ; i < s.length() ; i++){
            str.append(s.charAt(i) - 'a' + 1) ; 
        }
        System.out.println(str);
        for(int i = 0 ; i < k ; i++){
            sum = 0 ; 
            for(int j = 0 ; j< str.length() ; j++){
                sum += str.charAt(j) - '0' ; 
            }
            str = new StringBuilder(Integer.toString(sum)) ; 
            System.out.println(str);
            
        }
        return sum ; 
    }
}