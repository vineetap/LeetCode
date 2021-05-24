package main.java;

public class _200 {
        public int numIslands(char[][] grid) {
            if(grid==null || grid.length==0)
                return 0;

            int lenR =grid.length;
            int lenC =grid[0].length;
            int numberOfIslands=0;

            for(int r=0;r<lenR;r++){
                for(int c=0;c<lenC;c++){
                    if(grid[r][c]=='1'){
                        numberOfIslands++;
                        dfs(grid,r,c);
                    }
                }
            }

            return numberOfIslands++;
        }

        public void dfs(char[][] grid, int r, int c){
            int lenR =grid.length;
            int lenC =grid[0].length;

            if(r<0 || c<0 || r>=lenR || c>=lenC || grid[r][c]=='0')
                return;

            grid[r][c]='0';

            dfs(grid,r-1,c);
            dfs(grid,r,c+1);
            dfs(grid,r+1,c);
            dfs(grid,r,c-1);

        }
    }
