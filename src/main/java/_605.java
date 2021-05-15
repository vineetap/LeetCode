package main.java;

public class _605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;

        for(int i=0;i<flowerbed.length;i++){
            //For the first and last elements, we need not check the previous and the next adjacent positions respectively.
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0 ) && (i == flowerbed.length-1 || flowerbed[i+1]==0))
            {
                count++;
                flowerbed[i]=1;
            }
        }


        return n<=count;
    }
}
