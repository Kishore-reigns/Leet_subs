
class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        
        HashMap<String,HashSet<Character>> box = new HashMap<>() ; 
        
        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> row = new HashSet<>() ; 
            HashSet<Character> col = new HashSet<>() ;

            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] != '.'){
                    if(row.contains(board[i][j]))return false ; 
                    row.add(board[i][j]);

                    int r = (i/3) , c = j/3 ; 
                    String s = r+","+c ;
                     if(box.containsKey(s)){
                         if(box.get(s).contains(board[i][j]))return false ; 

                     }else{
                        box.put(s,new HashSet<>());
                     }
                     box.get(s).add(board[i][j]);

                   


                } 
                if(board[j][i] != '.'){
                    if(col.contains(board[j][i]))return false ; 
                   col.add(board[j][i]);
                }
            }
        }
        return true ; 
    }
}