package main.java;

public class _322 {
    public int coinChange(int[] coins, int amount) {
        if(amount<0)
            return -1;
        return coinChange(coins,amount,new int[amount]);
    }

    private int coinChange(int[] coins,int remaining,int[] count){
        if(remaining<0) return -1;
        if(remaining==0) return 0;
        if(count[remaining-1]!=0) return count[remaining-1]; //remaining-1 because of array index

        int min=Integer.MAX_VALUE;

        for(int coin:coins){
            int result=coinChange(coins,remaining-coin,count);
            if(result>=0 && result<min)
                min=result+1; //update the count
        }

        count[remaining-1]=min==Integer.MAX_VALUE?-1:min;
        return count[remaining-1];
    }
}
