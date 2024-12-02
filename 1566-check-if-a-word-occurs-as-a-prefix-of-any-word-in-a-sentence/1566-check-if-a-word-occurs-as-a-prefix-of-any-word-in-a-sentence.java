class Solution {
    public int isPrefixOfWord(String sent, String search) {
        String[] arr = sent.split(" ");
        int c = 0 ; 
        for(String s : arr){
            c++ ; 
            System.out.println(s);
            if(s.indexOf(search) == 0)return c ; 
        }
        return -1 ; 
    }
}