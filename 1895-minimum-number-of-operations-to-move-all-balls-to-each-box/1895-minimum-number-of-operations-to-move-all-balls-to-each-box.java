class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        int op = 0 , balls = 0 ; 
        for(int i = 0 ; i < n ; i++){
            answer[i] += op ;
            balls += boxes.charAt(i) - '0' ; 
            op += balls ; 
        }
        op = 0 ; balls = 0 ; 
        for(int i = n-1 ; i > -1 ; i--){
            answer[i] += op ; 
            balls += boxes.charAt(i) - '0';
            op += balls ; 
        }
        return answer ; 
    }
}