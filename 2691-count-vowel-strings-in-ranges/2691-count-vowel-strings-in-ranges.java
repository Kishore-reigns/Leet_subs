class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length , i = 0 ; 
        int[] pref =  new int[n+1];
        String vowels = "aeiou" ;

        for(String word : words){
            if( (vowels.indexOf(word.charAt(0)) != -1 ) && (vowels.indexOf(word.charAt(word.length()-1)) != -1) ){
                pref[i+1] = pref[i] + 1 ;
            }
            else{
                pref[i+1] = pref[i] ; 
            }
            i++ ; 
        }
        System.out.println(Arrays.toString(pref));
        int[] res = new int[queries.length];
        int count = 0 ; i = 0 ; 
        for(int[] q : queries){
            res[i++] = pref[q[1]+1] - pref[q[0]] ;  
        }
        return res ; 
    }
}