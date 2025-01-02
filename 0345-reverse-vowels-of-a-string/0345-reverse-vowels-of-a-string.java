class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        int i = 0 , j = s.length() - 1; 
        int n = s.length();
        StringBuilder res = new StringBuilder(s); 

        while(i < j){
            while( i < j && vowels.indexOf(res.charAt(i)) == -1 )i++ ; 
            while( j > i && vowels.indexOf(res.charAt(j)) == -1)j-- ; 
            //System.out.println(res.charAt(i) + " "+ res.charAt(j));
            char temp= res.charAt(i);
            res.setCharAt(i,res.charAt(j));
            res.setCharAt(j,temp);
            i++ ; j-- ; 
        }

        return res.toString() ; 
    }
}