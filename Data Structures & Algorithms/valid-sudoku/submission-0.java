class Solution {
    public boolean isValidSudoku(char[][] board) {
        //for row
        for(int j=0;j<board[0].length;j++){
            HashSet<Character> r=new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(r.contains(board[i][j])){
                    return false;
                }
                r.add(board[i][j]);
            }
        }
        // for column
        for(int i=0;i<board.length;i++){
            HashSet<Character> c=new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(c.contains(board[i][j])){
                    return false;
                }
                c.add(board[i][j]);
            }
        }
        //for 3x3 matrix
        for(int row=0;row<board.length;row+=3){
            for(int col=0;col<board[0].length;col+=3){
                HashSet<Character> g=new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(board[row+i][col+j]=='.'){
                            continue;
                        }
                        if(g.contains(board[row+i][col+j])){
                            return false;
                        }
                        g.add(board[row+i][col+j]);
                    }
                }
            }
        }
        return true;
    }
}
