package java.imp;

public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                int[] accumulator = new int[] {0};
                this.mark(grid, i, j, accumulator);
                maxArea = accumulator[0] > maxArea ? accumulator[0] : maxArea;
            }
        }
        return maxArea;
    }

    private void mark(int[][] grid, int i, int j, int[] accumulator) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return;
        grid[i][j] = 0;
        accumulator[0]++;

        int leftI = i, leftJ = j - 1;
        int rightI = i, rightJ = j + 1;
        int upI = i - 1, upJ = j;
        int downI = i + 1, downJ = j;

        this.mark(grid, leftI, leftJ, accumulator);
        this.mark(grid, rightI, rightJ, accumulator);
        this.mark(grid, upI, upJ, accumulator);
        this.mark(grid, downI, downJ, accumulator);
    }
}
