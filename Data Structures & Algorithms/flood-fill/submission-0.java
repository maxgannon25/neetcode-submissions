class Solution {

    private int[][] dirs = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };

    public void dfs(int r, int c, int[][] image, int color, int prevColor, int rows, int cols){

        image[r][c] = color;

        for (int[] d: dirs){
            int nr = d[0] + r;
            int nc = d[1] + c;

            if ((0 <= nr && nr < rows) && (0 <= nc && nc < cols) && image[nr][nc] == prevColor){
                dfs(nr, nc, image, color, prevColor, rows, cols);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int rows = image.length;
        int cols = image[0].length;

        int prevColor = image[sr][sc];

        if (prevColor == color) {
            return image;
        }

        dfs(sr, sc, image, color, prevColor, rows, cols);

        return image;
    }
}