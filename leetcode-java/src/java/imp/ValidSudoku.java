package java.imp;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] col = new boolean[9][9];
        boolean[][] grid = new boolean[9][9];
        for (int i = 0; i < board.length; i++) {
            boolean[] row = new boolean[9];
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                int val = board[i][j] - '0' - 1;
                if (row[val] || col[val][j] || grid[i / 3 + (j / 3) * 3][val]) return false;
                row[val] = true;
                col[val][j] = true;
                grid[i / 3 + (j / 3) * 3][val] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
    }
}
