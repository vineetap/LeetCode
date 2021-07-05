package main.java;

public class _1905 {
        int rowLen;
        int colLen;
        public int countSubIslands(int[][] grid1, int[][] grid2) {
            rowLen=grid1.length;
            colLen=grid1[0].length;

            int count=0;

            for(int r=0;r<rowLen;r++){
                for(int c=0;c<colLen;c++){

                    if(grid2[r][c]==1 && isSubIsland(grid1,grid2,r,c))
                        count++;
                }
            }

            return count;
        }

        private boolean isSubIsland(int[][] grid1, int[][] grid2,int r,int c){
            if(r>=rowLen || r<0 || c>=colLen || c<0 || grid2[r][c]==0)
                return true;
            grid2[r][c]=0;

            return isSubIsland(grid1,grid2,r-1,c)
                    & isSubIsland(grid1,grid2,r+1,c)
                    & isSubIsland(grid1,grid2,r,c-1)
                    & isSubIsland(grid1,grid2,r,c+1)
                    & grid1[r][c]==1;

        }
    }
