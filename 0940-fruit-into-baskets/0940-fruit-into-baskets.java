class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int res = 0 ; 
        int l = 0 , r = 0 , n = fruits.length; 

        while( r < n){
            int val = fruits[r];
            map.put(val,r);
            if(map.size() >  2 ){
                int idx = Collections.min(map.values()) ; 
                map.remove(fruits[idx]);
                l = idx + 1  ; 
                
            }
            res = Math.max(res,r-l+1);
            r++ ; 
        }

        return res; 
        
    }
}