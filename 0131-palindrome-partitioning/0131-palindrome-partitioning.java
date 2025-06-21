class Solution {
    List<List<String>>result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        StringBuilder str = new StringBuilder(s);
        part(0,str,new ArrayList<>());
        return result ; 
    }

    public void part(int i ,StringBuilder str,ArrayList<String>list){

        if(i >= str.length()){
            result.add(new ArrayList<>(list));
            return ; 
        }
        
        for(int j = i ; j < str.length() ; j++){
             
             if(isPali(str,i,j)){
                String s = str.substring(i,j+1) ; 
                list.add(s);
                part(j+1,str,list);
                list.remove(list.size()-1);
            }
            
        }
       
        
        return ; 
    }

    public boolean isPali(StringBuilder s,int i , int j){
      
        while(i < j){
            if(s.charAt(i) != s.charAt(j))return false ; 
            i++ ; j-- ; 
        }
        return true ; 
    }
}