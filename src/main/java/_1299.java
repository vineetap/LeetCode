package main.java;

public class _1299 {
    public int[] replaceElements(int[] arr) {
        int l =arr.length-1;
        int curMax=arr[l];
        arr[l]=-1;
        int temp;

        for(int i=l-1;i>=0;i--){
            temp=arr[i];
            arr[i]=curMax;

            if(temp>curMax)
                curMax=temp;

        }

        return arr;
    }
}
