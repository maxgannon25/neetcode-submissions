class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];

                if (c == '.'){
                    continue;
                }
                else if (seen.contains(c)){
                    return false;
                }
                seen.add(c);
            }
        }

         for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];

                if (c == '.'){
                    continue;
                }
                else if (seen.contains(c)){
                    return false;
                }

                seen.add(c);
            }
        }

        for (int row = 0; row < 9; row+=3) {
            for (int col = 0; col < 9; col+=3) {
                Set<Character> seen = new HashSet<>();
                for (int r = row; r < row + 3; r++) {
                    for (int c = col; c < col + 3; c++) {
                        char value = board[r][c];

                        if (value == '.'){
                            continue;
                        }
                        else if (seen.contains(value)){
                            return false;
                        }
                        seen.add(value);
                    }
                }
            }
        }

        return true;
    }
}
