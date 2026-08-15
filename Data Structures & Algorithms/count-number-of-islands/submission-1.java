class Solution {
    public void dfs(Set<List<Integer>> visited, int r, int c, char[][] grid, int rows, int cols){

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        for (int[] dir : dirs) {
            int row = r + dir[0];
            int col = c + dir[1];

            if (row >= 0 && row < rows &&
                col >= 0 && col < cols &&
                grid[row][col] == '1' && !visited.contains(List.of(row, col))){

                visited.add(List.of(row, col));
                dfs(visited, row, col, grid, rows, cols);
            }
        }
    }

    public int numIslands(char[][] grid) {

        // YOUR LOGIC HERE

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        Set<List<Integer>> visited = new HashSet<>();

        for (int r=0; r<rows; r++){
            for (int c=0; c<cols; c++){
                if (!visited.contains(List.of(r, c)) && grid[r][c] == '1'){
                    islands++;
                    visited.add(List.of(r, c));
                    dfs(visited, r, c, grid, rows, cols);
                }
            }
        }
        return islands;
    }
}
