package main.java;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1094 {

    //Sort & Heap
        public boolean carPooling(int[][] trips, int capacity) {
            Arrays.sort(trips,(t1, t2)->Integer.compare(t1[1],t2[1]));

            PriorityQueue<Pair<Integer,Integer>> heap=new PriorityQueue<Pair<Integer,Integer>>((p1, p2) -> Integer.compare(p1.getKey(),p2.getKey()));

            heap.add(new Pair(trips[0][2],trips[0][0]));
            int currentCapacity=trips[0][0];

            for(int r=1;r<trips.length;r++){
                //earlier end time is grreater than current trip start time
                while( !heap.isEmpty() && heap.peek().getKey()<=trips[r][1])
                {
                    Pair<Integer,Integer> curr=heap.poll();
                    currentCapacity-=curr.getValue();
                }

                currentCapacity+=trips[r][0];
                heap.add(new Pair(trips[r][2],trips[r][0]));
                if(currentCapacity>capacity)
                    return false;
            }

            return true;
        }

        //Bucket sort
    public boolean carPooling2(int[][] trips, int capacity) {
        int[] timestamp = new int[1001];
        for (int[] trip : trips) {
            timestamp[trip[1]] += trip[0];
            timestamp[trip[2]] -= trip[0];
        }
        int usedCapacity = 0;
        for (int number : timestamp) {
            usedCapacity += number;
            if (usedCapacity > capacity) {
                return false;
            }
        }
        return true;
    }
    }