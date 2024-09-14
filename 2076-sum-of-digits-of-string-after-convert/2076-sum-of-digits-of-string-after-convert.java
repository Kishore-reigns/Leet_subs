class Solution {
    public int getLucky(String s, int k) {
        int sum = 0 ;
        String str = ""; 
        for(int i = 0 ; i < s.length() ; i++){
            str += s.charAt(i) - 'a' + 1 ; 
        }
        System.out.println(str);
        for(int i = 0 ; i < k ; i++){
            sum = 0 ; 
            for(int j = 0 ; j< str.length() ; j++){
                sum += str.charAt(j) - '0' ; 
            }
            str = Integer.toString(sum) ; 
            System.out.println(str);
            
        }
        return sum ; 
    }
}