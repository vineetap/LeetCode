package main.java;

import java.util.Arrays;

public class _746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo=new int[cost.length+1];
        Arrays.fill(memo,-1);
        return minCostClimbingStairs(cost,cost.length,memo);
    }

    private int minCostClimbingStairs(int[] cost, int i,int[] memo){
        if(i<=1)
            return 0;

        if(memo[i]>0)
            return memo[i];

        int downOne=minCostClimbingStairs(cost,i-1,memo)+cost[i-1];
        int downTwo=minCostClimbingStairs(cost,i-2,memo)+cost[i-2];

        memo[i]=Math.min(downOne,downTwo);
        return memo[i];

    }
}
