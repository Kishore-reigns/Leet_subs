class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length , count = 0; 
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if( isPrefixAndSuffix(words[j],words[i]))count++ ; 
            }
        }
        return count ; 
    }

    public boolean isPrefixAndSuffix(String w1 , String w2){
        //System.out.println(w1 + " " + w2 + " " + w1.startsWith(w2) + " " +  w1.endsWith(w2)  );
        return ( w1.startsWith(w2) ) && ( w1.endsWith(w2) ) ;
    }
}