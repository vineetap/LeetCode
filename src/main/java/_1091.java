package main.java;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class _1091 {
        int[][] directions={{-1,0},{0,1},{1,0},{0,-1},
                {-1,-1},{-1,1},{1,1},{1,-1}};
        int rowLen;
        int colLen;
        public int shortestPathBinaryMatrix(int[][] grid) {
            // Firstly, we need to check that the start and target cells are open.
            if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) {
                return -1;
            }
            rowLen=grid.length;
            colLen=grid[0].length;

            List<Pair<Integer,Integer>> currentLayer=new ArrayList<Pair<Integer,Integer>>();
            List<Pair<Integer,Integer>> nextLayer=new ArrayList<Pair<Integer,Integer>>();
            int distance=1; //number od visited cells in the path
            boolean[][] visited=new boolean[rowLen][colLen];

            currentLayer.add(new Pair(0,0));

            while(!currentLayer.isEmpty()){

                for(Pair<Integer,Integer> currentLoc:currentLayer){
                    int currrentRow=currentLoc.getKey();
                    int currentCol =currentLoc.getValue();

                    if(currrentRow==rowLen-1 && currentCol==colLen-1)
                        return distance; //Target Reached

                    //Explore Neighbours for current location
                    for(Pair<Integer,Integer> neighbour:getNeighbours(currrentRow,currentCol,grid)){
                        int neighbourRow=neighbour.getKey();
                        int neighbourCol=neighbour.getValue();

                        if(visited[neighbourRow][neighbourCol])
                            continue;

                        visited[neighbourRow][neighbourCol]=true;
                        nextLayer.add(new Pair(neighbourRow,neighbourCol));

                    }
                }

                currentLayer=nextLayer;
                nextLayer=new ArrayList<Pair<Integer,Integer>>();
                distance++;

            }


            return -1; //Target not reachable
        }

        public List<Pair<Integer,Integer>> getNeighbours(int row, int col, int[][] grid){
            List<Pair<Integer,Integer>> neighbours=new ArrayList<Pair<Integer,Integer>>();
            for(int[] dir:directions){
                int r=row+dir[0];
                int c=col+dir[1];

                if(r>=0 && r<rowLen && c>=0 && c<colLen && grid[r][c]==0)
                    neighbours.add(new Pair(r,c));
            }

            return neighbours;
        }
    }
