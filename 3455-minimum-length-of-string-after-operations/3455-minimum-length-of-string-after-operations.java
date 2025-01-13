class Solution {
    public int minimumLength(String s) {
        int[] total = new int[26] ; 
        boolean[] deleted = new boolean[s.length()];
        for(char c : s.toCharArray()){
            total[c-'a']++ ; 
        }
    
        int[] visited = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i)  ;
            if(visited[c-'a'] > 0 && total[c-'a'] > 2){
                total[c-'a'] = total[c-'a'] - 2 ;  
            }else{
                visited[c-'a']++ ; 
            }
        }
        int sum = 0 ; 
        for(int i = 0 ; i < 26 ; i++){
            //System.out.println(total[i]+" ");
            sum += total[i];
        }
        return sum ; 
    }
}