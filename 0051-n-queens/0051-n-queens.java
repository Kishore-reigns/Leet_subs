class Solution {
    HashSet<Integer>col = new HashSet<>(); 
    HashSet<Integer>posd = new HashSet<>(); 
    HashSet<Integer>negd = new HashSet<>();
    List<List<String>>res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] c : board){
            Arrays.fill(c,'.');
        }

        check(0,board,n);
        return res ; 

    }

    public void check(int r , char[][] board , int n ){
        if(r == n){
            List<String> list = new ArrayList<>() ; 
            for(char[] row : board){
                list.add(new String(row));
            }
            res.add(list);
            return ; 
        }

        

        for(int c = 0 ; c < n ; c++){

            if(col.contains(c) || posd.contains(r+c) || negd.contains(r-c))continue ; 
            col.add(c);
            posd.add(r+c);
            negd.add(r-c);
            board[r][c] = 'Q';

            check(r+1,board,n);

            board[r][c] = '.';
            col.remove(c);
            posd.remove(r+c);
            negd.remove(r-c);
        }

        return ; 
    }
}