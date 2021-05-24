package main.java;

public class _733 {
        int colourToFill;
        int sourceColor;
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            colourToFill=newColor;
            sourceColor=image[sr][sc];
            if(colourToFill!=sourceColor)   // to avoid stack overflow e.g input [[0,0,0],[0,1,1]] 1, 1, 1 [colorToFill = sourceColor]
                dfsFloodFill(sr,sc,image);
            return image;
        }

        private void dfsFloodFill(int r,int c,int[][] image){
            if(r<0 || c<0 || r >= image.length || c >= image[0].length)
                return;
            if(image[r][c]==sourceColor){
                image[r][c]=colourToFill;
                dfsFloodFill(r,c-1,image);
                dfsFloodFill(r,c+1,image);
                dfsFloodFill(r-1,c,image);
                dfsFloodFill(r+1,c,image);

            }
        }
    }
