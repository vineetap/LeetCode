package main.java;

public class _73 {
    class Solution {
        boolean rowHasZeros = false;
        boolean columnHasZeros = false;

        public void setZeroes(int[][] matrix) {
            checkFristRowColumn(matrix);
            initFristRowColumn(matrix);

            // nullify rows based on first column
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][0] == 0)
                    nullifyRow(matrix, i);
            }

            // nullify columns based on first row
            for (int i = 1; i < matrix[0].length; i++) {
                if (matrix[0][i] == 0)
                    nullifyColumn(matrix, i);
            }

            if (rowHasZeros)
                nullifyRow(matrix, 0);
            if (columnHasZeros)
                nullifyColumn(matrix, 0);

        }


        public void checkFristRowColumn(int[][] matrix) {
            //Check first row for zeros
            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[0][i] == 0) {
                    rowHasZeros = true;
                    break;
                }
            }

            //Check first column for zeros
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0] == 0) {
                    columnHasZeros = true;
                    break;
                }
            }
        }

        //Ckeck for the zeros in rest of the matrix
        public void initFristRowColumn(int[][] matrix) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        public void nullifyRow(int[][] matrix, int r) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[r][i] = 0;
            }
        }

        public void nullifyColumn(int[][] matrix, int c) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}