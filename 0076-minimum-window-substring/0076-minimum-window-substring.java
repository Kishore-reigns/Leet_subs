class Solution {
    public String minWindow(String s, String t) {
        int n1 = s.length() , have = 0 , mini = Integer.MAX_VALUE;  
    
        int l = 0 , r = 0 ,start = -1 ,  end = -1; 
        HashMap<Character,Integer>ft= new HashMap<>();
        HashMap<Character,Integer>fs= new HashMap<>();
     
        for(char c : t.toCharArray()){
            ft.put(c,ft.getOrDefault(c,0)+1);
        }
        int need = ft.size();
        for(r= 0 ; r < n1 ; r++){
            char c = s.charAt(r);
          
            fs.put(c,fs.getOrDefault(c,0)+1);
            if( ft.containsKey(c) && fs.get(c).equals(ft.get(c)))have++ ; 
            

            while(have == need){
                if(r-l+1 < mini){
                    start = l ; 
                    end = r ; 
                    mini = r-l+1 ; 
                }
           
                char left = s.charAt(l);
                fs.put(left,fs.get(left) - 1);
                if(ft.containsKey(left) && fs.get(left) < ft.get(left) ){
                   have-- ; 
                }
                 if (fs.get(left) == 0) {
                    fs.remove(left);
                }
                l++ ; 
            }
        }

        if(start == -1)return "";
        return s.substring(start,end+1) ; 
    }
}