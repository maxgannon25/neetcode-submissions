class Solution {
    private static final int[][] DIRECTIONS = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == '1') {
                    islands++;

                    dfs(grid, r, c, rows, cols);
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int r, int c, int rows, int cols) {

        if (r < 0 || r >= rows ||
            c < 0 || c >= cols ||
            grid[r][c] != '1') {
            return;
        }

        // Mark as visited
        grid[r][c] = '0';

        for (int[] direction : DIRECTIONS) {

            int nr = r + direction[0];
            int nc = c + direction[1];

            dfs(grid, nr, nc, rows, cols);
        }
    }
}
