class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder stack = new StringBuilder() ; 
        HashSet<Character> set = new HashSet<>() ; 
        int[] freq = new int[26];

        for(char c : s.toCharArray())freq[c-'a']++ ; 

        stack.append(s.charAt(0));
        freq[s.charAt(0) - 'a']-- ; 
        set.add(s.charAt(0));

        for(int i = 1 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(!set.contains(c)){
                char top = stack.charAt(stack.length()-1); 
                while( stack.length() != 0 && c < top  && freq[top-'a'] != 0){
                    stack.deleteCharAt(stack.length()-1);
                    set.remove(top);
                    if(stack.length() == 0)break ; 
                    top = stack.charAt(stack.length()-1);
                }

                 set.add(c);
                 stack.append(c);
            }

            freq[c-'a']--;
        }

        return stack.toString() ; 
    }
}