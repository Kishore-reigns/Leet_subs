class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder s1, s2 ; 
        if(num1.length() > num2.length()){
            s1 = new StringBuilder(num1);
            s2 = new StringBuilder(num2);
        }else{
            s1 = new StringBuilder(num2);
            s2 = new StringBuilder(num1);
        }
        s1 = s1.reverse() ; s2 = s2.reverse() ; 
        int carry = 0 ; 
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s1.length() ; i++){
            int n1 = s1.charAt(i) -'0' ;
            int n2 = (i < s2.length())? s2.charAt(i) - '0' : 0 ; 
            int sum = n1 + n2 + carry ; 
            int val = ( sum)%10 ; 
            carry = (sum)/ 10 ; 
            res.append(val);
        }
        if(carry !=0)res.append(carry);

        return res.reverse().toString() ; 
       

    }
}