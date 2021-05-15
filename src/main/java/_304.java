package main.java;

    class NumMatrix {
        int rowLen;
        int colLen;
        int[][] sum;

        public NumMatrix(int[][] matrix) {
            rowLen=matrix.length;
            colLen=matrix[0].length;
            sum=matrix;

            for(int r=0;r<rowLen;r++){
                for(int c=1;c<colLen;c++){
                    sum[r][c]=sum[r][c-1]+sum[r][c];
                }
            }

            for(int r=1;r<rowLen;r++){
                for(int c=0;c<colLen;c++){
                    sum[r][c]=sum[r-1][c]+sum[r][c];
                }
            }

        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int result=0;
            result= sum[row2][col2]-((row1!=0?sum[row1-1][col2]:0)+(col1!=0?sum[row2][col1-1]:0)-(row1!=0&col1!=0?sum[row1-1][col1-1]:0));

            return result;
        }
    }

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
