package java.imp;

public class UniPath {
    public int uniquePaths(int m, int n) {
        int[][] cols = new int[m + 1][n + 1];
        cols[1][1] = 1;

        for (int i=1;i<cols.length;i++) {
            for (int j=1;j<cols[0].length;j++) {
                if (i == 1 && j== 1) continue;
                cols[i][j] = cols[i-1][j] + cols[i][j-1];
            }
        }

        return cols[m][n];
    }
}
