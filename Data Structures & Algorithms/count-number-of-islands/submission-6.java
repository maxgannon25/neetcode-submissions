class Solution {

    int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public void dfs(int r, int c, int rows, int cols, char[][] grid){

        for (int[] d: dirs){
            int nr = d[0] + r;
            int nc = d[1] + c;

            if ((nr >=0 && nr < rows) && (nc >=0 && nc < cols)){
                if (grid[nr][nc] == '1'){
                    grid[nr][nc] = '0';
                    dfs(nr, nc, rows, cols, grid);
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        for (int r=0; r<rows; r++){
            for (int c=0; c<cols; c++){
                if (grid[r][c] == '1'){
                    grid[r][c] = '0';
                    islands++;
                    dfs(r, c, rows, cols, grid);
                }
            }
        }

        return islands;
    }
}
