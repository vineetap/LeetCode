package main.java;

public class _463 {
        int rowLen;
        int colLen;
        int[][] directions={{-1,0},{0,1},{1,0},{1,-1}};
        public int islandPerimeter(int[][] grid) {
            if(grid==null)
                return 0;
            rowLen=grid.length;
            colLen=grid[0].length;
            int perimeter;
            boolean[][] visited =new boolean[rowLen][colLen]; //If allowed to modify input then set some other value like 2 for visited 1's otherwsie use visited grid

            for(int r=0;r<rowLen;r++){
                for(int c=0;c<colLen;c++){
                    if(grid[r][c]==1)
                        return dfsPerimiter(r,c,grid,visited);
                }
            }
            return 0; //no land found
        }

        private int dfsPerimiter(int r,int c,int[][] grid,boolean[][] visited ){
            if(r<0 || r>=rowLen || c<0 || c>=colLen ) //boundary reached
                return 1;
            if(grid[r][c]==0) //water
                return 1;
            if(visited[r][c]) //already visited
                return 0;

            visited[r][c]=true; //mark this visted

            int count = dfsPerimiter(r-1,c,grid,visited)+
                    dfsPerimiter(r,c+1,grid,visited)+
                    dfsPerimiter(r+1,c,grid,visited)+
                    dfsPerimiter(r,c-1,grid,visited);

            return count;
        }

        //Counting
        public int islandPerimeter2(int[][] grid) {
                int rows = grid.length;
                int cols = grid[0].length;

                int result = 0;
                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        if (grid[r][c] == 1) {
                            result += 4;

                            if (r > 0 && grid[r - 1][c] == 1) {
                                result -= 2;
                            }

                            if (c > 0 && grid[r][c - 1] == 1) {
                                result -= 2;
                            }
                        }
                    }
                }

                return result;
            }

    }
