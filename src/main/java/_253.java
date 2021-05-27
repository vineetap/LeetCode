package main.java;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _253 {
        public int minMeetingRooms(int[][] intervals) {
            Arrays.sort(intervals,(i1, i2)->Integer.compare(i1[0],i2[0]));
            PriorityQueue<Integer> heap=new PriorityQueue<Integer>((i1, i2)->i1-i2);

            heap.add(intervals[0][1]); // End time of first meeting

            for(int r=1;r<intervals.length;r++){

                if(!heap.isEmpty() && heap.peek()<= intervals[r][0]) //if any conf room getting free by the start time of r
                    heap.poll();

                heap.add(intervals[r][1]);
            }

            return heap.size();
        }
    }
