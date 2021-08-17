package main.java;

public class _70 {
    public int climbStairs(int n) {
        return climbStairs(0,n,new int[n+1]);
    }

    public int climbStairs(int i, int n,int[] memo){

        if(i>n)
            return 0;
        if(i==n)
            return 1;

        if(memo[i]>0)
            return memo[i];

        memo[i]= climbStairs(i+1,n,memo)+ climbStairs(i+2,n,memo);
        return memo[i];
    }
}
