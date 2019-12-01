package java.imp;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean isFirstColumnZeros = false;
        boolean isFirstRowZeros = false;

        // check whether first column should be zeros
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isFirstColumnZeros = true;

            }
        }

        // check whether first row should be zeros
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZeros = true;
            }
        }

        // annotate if the column and the row should be marked as zeros
        for (int i=1;i<matrix.length;i++) {
            for (int j=1;j<matrix[0].length;j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // if the value of first column is marked as zero, the corresponding row should be zeros
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j=1;j<matrix[i].length;j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // if the value of first row is marked as zero, the corresponding column should be zeros
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i=1;i<matrix.length;i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstColumnZeros) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;

            }
        }

        if (isFirstRowZeros) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
