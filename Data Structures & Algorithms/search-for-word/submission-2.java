class Solution {
    private int[][] dirs = new int[][]{{0,1}, {0,-1}, {-1,0}, {1,0}};
    
        public boolean dfs(
            int index,
            int row,
            int col,
            char[][] board,
            int rlen,
            int clen,
            String word) {

        
        if (index == word.length()){
            return true;
        }

        char original = board[row][col];
        board[row][col] = '-';

        for (int[] dir : dirs){
            int nr = row + dir[0];
            int nc = col + dir[1];

            if (nr < 0 || nr > rlen-1 || nc < 0 || nc > clen-1){
                continue;
            }

            if (board[nr][nc] == word.charAt(index)){
                if (dfs(index+1, nr, nc, board, rlen, clen, word)){
                    return true;
                }
            }
        }
        board[row][col] = original;
        
        return false;
    }


    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        int index = 0;

        for (int r=0; r< rows; r++){
            for (int c=0; c<cols; c++){
                if (board[r][c] == word.charAt(index)){
                    if (dfs(index + 1, r, c, board, rows, cols, word)){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
