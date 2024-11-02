class Solution {
    public boolean isCircularSentence(String sent) {
        String[] arr = sent.split(" ");
        if(arr.length == 1){
            if(sent.charAt(0) == sent.charAt(sent.length()-1))return true ; 
            return false ;
        }

        if(arr[0].charAt(0) != arr[arr.length-1].charAt(arr[arr.length-1].length() -1 ))return false ;
        for(int i = 0 ; i < arr.length -1  ; i++){
            if(arr[i].charAt(arr[i].length() - 1 ) != arr[i+1].charAt(0))return false ; 
        }
        
        return true ; 
    }
}