class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int alength = allowed.length() ,res = 0 ; 
        for(int i = 0 ; i < words.length ; i++){
            char[] arr = words[i].toCharArray();
            alength = 0 ; 
            for(int j = 0 ; j < arr.length ; j++){
                if(allowed.indexOf(arr[j]) != -1 )alength++ ;
            }
            if(alength >= arr.length)res++ ; 
        }

        return res ; 
    }
}