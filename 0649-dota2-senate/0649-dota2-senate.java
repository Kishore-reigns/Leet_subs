class Solution {
    public String predictPartyVictory(String sen) {
       Queue<Integer>r = new LinkedList<>() ;
       Queue<Integer>d = new LinkedList<>() ; 
        int i = 0 ; 
       for(char c : sen.toCharArray()){
        if(c == 'R')r.offer(i);
        else d.offer(i);
        i++ ; 
       } 

       while(!r.isEmpty() && !d.isEmpty()){
        int rin = r.poll() ; 
        int din = d.poll() ; 
        if(rin < din){
            r.offer(rin+sen.length());
        }else{
            d.offer(din+sen.length());
        }
       }

       if(r.isEmpty())return "Dire";
       return "Radiant";

    }
}