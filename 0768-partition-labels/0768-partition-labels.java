class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>list = new ArrayList<>();
        int lastindex = -1, start = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            lastindex = Math.max(lastindex, s.lastIndexOf(s.charAt(i)));
            if(i == lastindex){
                list.add(lastindex - start + 1);
                start = i+1 ; 
            }
        }
        return list ; 
    }
}