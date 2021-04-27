package main.java;

import java.util.Arrays;
import java.util.LinkedList;

public class _56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i1, i2)->Integer.compare(i1[0],i2[0]));
        LinkedList<int[]> list=new LinkedList();

        for(int[] interval:intervals){
            if(list.isEmpty() || list.getLast()[1]<interval[0])
                list.add(interval);
            else
                list.getLast()[1]=Math.max( list.getLast()[1],interval[1]);
        }

        return list.toArray(new int[list.size()][]);
    }
}
