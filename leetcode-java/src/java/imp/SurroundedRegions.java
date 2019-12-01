package java.imp;

public class SurroundedRegions {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;

        for (int j=0;j<board[0].length;j++) {
            if (board[0][j] == 'O' && this.isConnected(board, 0, j)) {
                board[0][j] = 'A';
            }
        }

        for (int j=0;j<board[0].length;j++) {
            if (board[board.length -1][j] == 'O' && this.isConnected(board, board.length - 1 , j)) {
                board[board.length -1][j] = 'A';
            }
        }

        for (int i=0;i<board.length;i++) {
            if (board[i][0] == 'O' && this.isConnected(board, i , 0)) {
                board[i][0] = 'A';
            }
        }

        for (int i=0;i<board.length;i++) {
            if (board[i][board[0].length - 1] == 'O' && this.isConnected(board, i , board[0].length - 1)) {
                board[i][board[0].length - 1] = 'A';
            }
        }

        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if (board[i][j] == 'O' && this.isConnected(board, i, j)) {
                    board[i][j] = 'A';
                }
            }
        }

        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private boolean isConnected(char[][] board, int i, int j) {
        if (i - 1 < 0 || i + 1 >= board.length || j - 1 < 0 || j + 1 >= board[0].length) {
            return true;
        }
        int leftI = i, leftJ = j - 1;
        int rightI = i, rightJ = j + 1;
        int upI = i - 1, upJ = j;
        int downI = i + 1, downJ = j;

        return board[leftI][leftJ] == 'A' || board[rightI][rightJ] == 'A' || board[upI][upJ] == 'A' || board[downI][downJ] == 'A';
    }

    public static void main(String[] args) {
        char[][] map = new char[][] { {'O','O','O'},{'O','O','O'},{'O','O','O'}};
        SurroundedRegions surroundedRegions = new SurroundedRegions();
        surroundedRegions.solve(map);
    }
}
