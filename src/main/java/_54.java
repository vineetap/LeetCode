package main.java;

import java.util.ArrayList;
import java.util.List;

public class _54 {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<Integer>();

            int rowStart = 0;
            int rowEnd = matrix.length - 1;
            int colStart = 0;
            int colEnd = matrix[0].length - 1;

            while (rowStart <= rowEnd && colStart <= colEnd) {
                // System.out.println("Starting for : "+rowStart+" "+rowEnd+" "+colStart+" "+colEnd);

                for (int c = colStart; c <= colEnd; c++)
                    result.add(matrix[rowStart][c]);

                for (int r = rowStart + 1; r <= rowEnd; r++)
                    result.add(matrix[r][colEnd]);

                if (rowStart < rowEnd && colStart < colEnd) //In case of single row or single column
                {
                    for (int c = colEnd - 1; c >= colStart; c--)
                        result.add(matrix[rowEnd][c]);

                    for (int r = rowEnd - 1; r > rowStart; r--)
                        result.add(matrix[r][colStart]);
                }

                rowStart++;
                rowEnd--;
                colStart++;
                colEnd--;
            }

            return result;
        }
    }

