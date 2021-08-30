package main.java;

public class _1304 {
    public int[] sumZero(int n) {
        int[] result=new int[n];

        for(int i=1;i<n;i++){
            result[i]=i;
            result[0]-=i;
        }

        return result;
    }
}
