package main.java;

public class _48 {
        public void rotate(int[][] matrix) {
            //check if square
            if(matrix.length==0 || matrix.length!=matrix[0].length)
                return;
            int n=matrix.length;

            for(int layer=0;layer<n/2;layer++){
                int first=layer;
                int last=n-1-layer;

                for(int i=first;i<last;i++){
                    int offset=i-first;

                    int top=matrix[first][i]; //top

                    //left to top
                    matrix[first][i]=matrix[last-offset][first];

                    //bottom to left
                    matrix[last-offset][first]=matrix[last][last-offset];

                    //right to bottom
                    matrix[last][last-offset]=matrix[i][last];

                    //top to right
                    matrix[i][last]=top;

                }

            }

        }
    }

