class Solution {
    int[][] dirs = new int[][]{{0,1}, {0,-1}, {1, 0}, {-1,0}};

    public int orangesRotting(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;

        Deque<int[]> q = new ArrayDeque<>();
        int fresh = 0;

        for (int r=0; r<rows; r++){
            for (int c=0; c<cols; c++){
                if (grid[r][c] == 2){
                    q.offer(new int[]{r,c});
                }
                if (grid[r][c] == 1){
                    fresh++;
                }
            }
        }

        int mins = 0;
        while(!q.isEmpty() && fresh > 0){

            int levelSize = q.size();

            for (int i=0; i<levelSize; i++){

                int[] item = q.poll();
                int row = item[0];
                int col = item[1];

                for (int[] dir: dirs){
                    int nr = dir[0] + row;
                    int nc = dir[1] + col;

                    if (nr < 0 || nr >= rows || nc < 0 || nc >= cols){
                        continue;
                    }

                    if (grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
            mins++;
        }

        if (fresh > 0){
            return -1;
        }

        return mins;
    }
}
