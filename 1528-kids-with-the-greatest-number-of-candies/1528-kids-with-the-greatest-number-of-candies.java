class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int maxi = Arrays.stream(candies).max().getAsInt() ; 
        List<Boolean> res = new ArrayList<>() ; 
        for(int n : candies){
            if(n+e >= maxi)res.add(true);
            else res.add(false);
        }
        return res ;
    }
}