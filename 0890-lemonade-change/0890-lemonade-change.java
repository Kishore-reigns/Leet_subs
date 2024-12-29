class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0 , ten = 0;
        if(bills[0] > 5)return false ; 
        for(int bill : bills){
            if(bill == 5)five++ ;
            if(bill == 10){
                if( five > 0){
                    five-- ;
                    ten++ ; 
                }
                else return false ; 
            }else if(bill == 20){
                if(ten > 0 && five > 0){
                    ten-- ; five-- ;
                }else if(five >= 3){
                    five -= 3 ; 
                }else return false ; 
            } 
        }
       return true ; 

    }
}