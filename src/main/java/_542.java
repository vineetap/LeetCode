package main.java;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Queue;

public class _542 {
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        public int[][] updateMatrix(int[][] mat) {
            Queue<Pair<Integer,Integer>> q=new ArrayDeque<Pair<Integer,Integer>>();

            for(int r=0;r<mat.length;r++){
                for(int c=0;c<mat[0].length;c++){
                    if(mat[r][c]==1){
                        mat[r][c]=-1; //to distinguish between orginal 1 & distance 1
                    }
                    else       // To push all zeros in q for bfs
                        q.offer(new Pair(r,c));
                }
            }

            int length=0;
            int qSize=0;
            while(!q.isEmpty()){
                length++;
                qSize=q.size();

                for(int i=0;i<qSize;i++){
                    Pair<Integer,Integer> currentLoc=q.poll();
                    int currrentRow=currentLoc.getKey();
                    int currentCol =currentLoc.getValue();
                    for(int[] dir:directions){
                        int r=currrentRow+dir[0];
                        int c=currentCol+dir[1];
                        if(r>=0 && r<mat.length && c>=0 && c<mat[0].length )
                            if(mat[r][c]==-1)
                            {
                                mat[r][c]=length;
                                q.offer(new Pair(r,c));
                            }
                    }
                }
            }

            return mat;
        }

    }