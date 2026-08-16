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

        // We found the whole word
        if (index == word.length()) {
            return true;
        }

        // Mark current cell as visited
        char original = board[row][col];
        board[row][col] = '-';
        

        for (int[] dir : dirs) {

            int r = row + dir[0];
            int c = col + dir[1];

            // Check bounds
            if (r < 0 || r >= rlen || c < 0 || c >= clen) {
                continue;
            }

            // Check whether this cell is the next character
            if (board[r][c] == word.charAt(index)) {
        
                       if (dfs(index + 1, r, c, board, rlen, clen, word)) {
                    return true;
                }
            }
        }

        // Backtrack: restore the cell
        board[row][col] = original;

        return false;
    }


    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (board[r][c] == word.charAt(0)) {

                    if (dfs(1, r, c, board, rows, cols, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
