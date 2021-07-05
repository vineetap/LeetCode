package main.java;

public class _59 {
        public int[][] generateMatrix(int n) {
            int[][] matrix=new int[n][n];
            int rowStart=0;
            int rowEnd=matrix.length-1;
            int colStart=0;
            int colEnd=matrix[0].length-1;

            int count=1;

            while(rowStart<=rowEnd && colStart<=colEnd){

                for(int c=colStart;c<=colEnd;c++,count++)
                    matrix[rowStart][c]=count;

                for(int r=rowStart+1;r<=rowEnd;r++,count++)
                    matrix[r][colEnd]=count;

                if(rowStart<rowEnd && colStart<colEnd) //In case of single row or single column
                {
                    for(int c=colEnd-1;c>=colStart;c--,count++)
                        matrix[rowEnd][c]=count;

                    for(int r=rowEnd-1;r>rowStart;r--,count++)
                        matrix[r][colStart]=count;
                }

                rowStart++;
                rowEnd--;
                colStart++;
                colEnd--;
            }

            return matrix;
        }
    }
