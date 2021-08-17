package main.java;

import java.util.*;

public class _743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap();

        for(int[] time:times){
            graph.putIfAbsent(time[0],new ArrayList());
            graph.get(time[0]).add(new int[]{time[1],time[2]});
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b)->a[0]-b[0]);
        int[] minimumDistance=new int[n+1];
        Arrays.fill(minimumDistance,Integer.MAX_VALUE); //All distance is set to infinity
        minimumDistance[k]=0; //Source distance is set to zero
        boolean[] visited=new boolean[n+1];
        pq.offer(new int[]{0,k});

        int result=0;

        while(!pq.isEmpty()){
            int[] current=pq.poll();
            int currentDistance=current[0];
            int currentNode=current[1];

            if(visited[currentNode]) continue;

            visited[currentNode]=true;
            n--;
            result=currentDistance;

            if(!graph.containsKey(currentNode)) continue;

            for (int[] next : graph.get(currentNode)) {
                if (!visited[next[0]] && currentDistance + next[1] < minimumDistance[next[0]])
                    pq.offer(new int[]{currentDistance + next[1], next[0]});
            }

        }

        return n==0?result:-1; //if all nodes are not visited then return -1
    }
}
