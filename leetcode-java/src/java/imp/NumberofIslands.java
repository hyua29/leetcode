package java.imp;

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if (grid[i][j] == '1') {
                    count++;
                    this.mark(grid, i, j);
                }

            }
        }
        return count;
    }

    private void mark(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || grid[i][j] == 'v') {
            return;
        }
        grid[i][j] = 'v';

        int leftI = i, leftJ = j - 1;
        int rightI = i, rightJ = j + 1;
        int upI = i - 1, upJ = j;
        int downI = i + 1, downJ = j;

        this.mark(grid, leftI, leftJ);
        this.mark(grid, rightI, rightJ);
        this.mark(grid, upI, upJ);
        this.mark(grid, downI, downJ);
    }

    public static void main(String[] args) {
        char[][] map = new char[][] { {'1','1','0'},{'1','0','0'},{'0','0','0'}};
        NumberofIslands umberofIslands = new NumberofIslands();
        umberofIslands.numIslands(map);
    }
}
