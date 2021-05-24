package main.java;

public class _1034 {
        int oldColor;
        public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
            oldColor=grid[r0][c0];

            dfsColorABorder(grid,r0,c0);

            for(int r=0;r<grid.length;r++){
                for(int c=0;c<grid[0].length;c++){
                    if(grid[r][c]<0)
                        grid[r][c]=color;
                }
            }

            return grid;
        }

        private void dfsColorABorder(int[][] grid,int r,int c){
            if(r<0 || c<0 || r>= grid.length || c >=grid[0].length || grid[r][c]!=oldColor)
                return;
            grid[r][c]=-oldColor;

            dfsColorABorder(grid,r-1,c);
            dfsColorABorder(grid,r+1,c);
            dfsColorABorder(grid,r,c+1);
            dfsColorABorder(grid,r,c-1);

            if(r>0 && c>0 &&  r<grid.length-1 && c <grid[0].length -1
                    && oldColor==Math.abs(grid[r+1][c])
                    && oldColor==Math.abs(grid[r-1][c])
                    && oldColor==Math.abs(grid[r][c-1])
                    && oldColor==Math.abs(grid[r][c+1]))
                grid[r][c]=oldColor;

        }

    }
