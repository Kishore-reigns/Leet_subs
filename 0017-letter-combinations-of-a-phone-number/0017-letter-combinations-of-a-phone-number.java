class Solution {
    String[] phone = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String>res = new ArrayList<>() ; 
    public List<String> letterCombinations(String digits){
        if(digits.length() == 0)return res; 
        StringBuilder str = new StringBuilder("");
        combi(0,digits,str);
        return res ; 
    }

    public void combi(int d , String digits , StringBuilder str){
        if(d == digits.length()){
            res.add(str.toString());
            return ; 
        }
        int digit = digits.charAt(d) - '0';
     

        String key = phone[digit];
        for(int i = 0 ; i < key.length() ; i++){
            str.append(key.charAt(i));
            combi(d+1,digits,str);
            str.deleteCharAt(str.length()-1);
        }
        return ;
        
    }
}