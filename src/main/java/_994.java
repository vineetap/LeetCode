package main.java;

import javafx.util.Pair;

import java.util.LinkedList;

public class _994 {

        public int orangesRotting(int[][] grid) {
            if(grid==null || grid.length ==0)
                return 0;

            LinkedList<Pair<Integer,Integer>> queue=new LinkedList<Pair<Integer,Integer>>();

            int rLen= grid.length;
            int cLen= grid[0].length;
            int freshCount=0;

            for(int r=0;r<rLen;r++){
                for(int c=0;c<cLen;c++){

                    if(grid[r][c]==2) //rotten orange
                        queue.add(new Pair(r,c));
                    if(grid[r][c]==1)  //fresh orange
                        freshCount++;
                }
            }

            int currentLevel=queue.size();
            int timeLapsed=0;
            Pair<Integer,Integer> curr;
            int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};

            // System.out.println("Fresh "+freshCount +" Queue "+currentLevel);

            while(!queue.isEmpty()){

                if(currentLevel==0){
                    timeLapsed++;
                    currentLevel=queue.size();
                }

                curr=queue.poll();
                currentLevel--;
                for(int r=0;r<directions.length;r++){
                    int newRow=curr.getKey()+directions[r][0];
                    int newCol=curr.getValue()+directions[r][1];

                    if(newRow <0 || newRow >=rLen || newCol<0 ||newCol>=cLen )
                        continue;
                    if(grid[newRow][newCol]==1) //fresh found
                    {
                        freshCount--;
                        grid[newRow][newCol]=2;
                        queue.add(new Pair(newRow,newCol));
                    }
                }
            }


            return freshCount>0?-1:timeLapsed;
        }
    }
