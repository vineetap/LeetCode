package main.java;

public class _240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen=matrix.length;
        int colLen=matrix[0].length;
        int row=0; //Top right corner
        int col=colLen-1;

        while(row<rowLen && col>=0){
            if(matrix[row][col]>target)
                col--;
            else if(matrix[row][col]<target)
                row++;
            else
                return true;
        }

        return false;
    }
}
