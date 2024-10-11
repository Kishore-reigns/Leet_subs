class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] sorted = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Map<Integer,Integer>map = new HashMap<>() ; 
        Arrays.sort(sorted,(a,b)->b-a);
        String[] res = new String[score.length] ; 
        int place = 1 ; 
        for(int i : sorted){
            map.put(i,place);
            place++ ; 
        }
        int j = 0 ; 
        for(int i : score){
            if(map.get(i) == 1){
                res[j] = "Gold Medal";
            }else if(map.get(i) == 2){
                res[j] = "Silver Medal";
            }else if(map.get(i) == 3){
                res[j] = "Bronze Medal";
            }else{
                res[j] = String.valueOf(map.get(i)) ; 
            }
            j++ ; 
        }
        return res ; 
    }
}