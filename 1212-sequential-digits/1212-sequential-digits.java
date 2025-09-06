class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789" ; 
        int n = s.length() ; 
        List<Integer> res = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            for(int j =i+1 ; j <= n ; j++){
                int num = Integer.parseInt(s.substring(i,j));
                if(num>= low && num <= high)res.add(num);
                
            }
        }
        Collections.sort(res);
        return res ; 

    }
}