class Pair{
    int start , end ;
    public Pair(int start , int end){
        this.start = start ; 
        this.end = end ; 
    } 
}

class MyCalendar {
    List<Pair>list = null ; 
    public MyCalendar() {
        list = new ArrayList<>() ; 
    }
    
    public boolean book(int start, int end) {
       if( list.size() == 0){
        list.add(new Pair(start , end));
        return true ; 
       }
      
       for(int i = 0 ; i < list.size() ; i++){
        if( start < list.get(i).end && end > list.get(i).start
            
        ) return false ; 
            
        
       }
        list.add(new Pair(start , end));
            return true ;
      
       
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */