class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length() + 1];
        return check(0,s,wordDict,dp);
    }

    public boolean check(int start , String s , List<String> dict , Boolean dp[]){

        if(start == s.length())return true ; 

        if(dp[start] != null)return dp[start] ; 

        for(int i = start + 1 ; i <= s.length() ; i++){
            String prefix = s.substring(start,i);
            if(dict.contains(prefix)){
                if(check(i,s,dict,dp))return dp[start] = true ; 
            }
        }
        return dp[start]=  false ; 
    }

    public boolean helper(int i , String s , List<String> dict){

        if(s.equals(""))return true ; 
        if( i >= dict.size())return false ; 
        
        if(s.contains(dict.get(i))){
            s = s.replaceFirst(dict.get(i),"");
            if(helper(i,s,dict))return true ;
        }
        
        return  helper(i+1,s,dict); 

    }
}