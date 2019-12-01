package java.imp;

public class RotateImage {
    public void rotate(int[][] matrix) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix.length - i - 1;j++) {
                this.swap(matrix, i, j, matrix.length - 1 - j, matrix.length - 1 - i);
            }
        }


        for (int i=0;i<matrix.length / 2;i++) {
            for (int j=0;j<matrix.length;j++) {
                this.swap(matrix, i, j, matrix.length - 1 - i, j);
            }
        }
    }

    private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }



}
