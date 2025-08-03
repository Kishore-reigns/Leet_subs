class Solution {
    Boolean[] dp ; 
    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new Boolean[s.length()];

        return check(0,s,wordDict); 
    }

    public boolean check(int i , String s , List<String> words){
        if(i == s.length())return true ; 
        if(dp[i] != null )return dp[i];

        for(String w : words){
            if(i+w.length() <= s.length() && s.substring(i,i+w.length()).equals(w)){
                if(check(i+w.length(),s,words))return dp[i] = true ; 
            }
        }

        return dp[i] = false ; 
    }
    
}