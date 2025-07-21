class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String prev = folder[0];
        List<String>res = new ArrayList<>();
        res.add(prev);
        for(int i = 1 ; i < folder.length ; i++){
            String cur = folder[i];
            int prevlength = prev.length() ; 
            if(cur.contains(prev) && cur.indexOf(prev) == 0 
             && cur.charAt(prevlength)=='/' && prevlength+1 < cur.length()){
                continue ; 
            }else{
                res.add(cur);
                prev = cur ; 
            }
        }

        return res ; 
    }
}