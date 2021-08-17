package main.java;

import java.util.Arrays;

public class _547 {
    public int findCircleNum(int[][] isConnected) {
        int[] parentArr=new int[isConnected.length];
        Arrays.fill(parentArr,-1);

        for(int r=0;r<isConnected.length;r++){
            for(int c=0;c<isConnected.length;c++){
                if(isConnected[r][c]==1 & r!=c){
                    union(parentArr,r,c);
                }
            }
        }

        int count=0;
        for(int i=0;i<parentArr.length;i++){
            if(parentArr[i]==-1)
                count++;
        }

        return count;
    }

    private void union(int[] parentArr, int r, int c){
        int rParent=find(parentArr,r);
        int cParent=find(parentArr,c);

        if(rParent!=cParent)
            parentArr[rParent]=cParent;
    }

    private int find(int[] parentArr,int r){
        if(parentArr[r]==-1)
            return r;
        return find(parentArr, parentArr[r]);
    }
}
