package main.java;

public class _121 {
        public int maxProfit(int[] prices) {

            int minPrice=Integer.MAX_VALUE;
            int maxProfit=0;

            for(int i=0;i< prices.length;i++)
            {
                if(prices[i]<minPrice)
                    minPrice=prices[i];
                else if((prices[i]-minPrice)> maxProfit) //For maximum orice
                    maxProfit=prices[i]-minPrice;
            }

            return maxProfit;
        }
    }