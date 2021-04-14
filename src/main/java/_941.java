package main.java;

public class _941 {
    public boolean validMountainArray(int[] arr) {
        int l = arr.length - 1;
        int i = 0;

        while (i < l && (arr[i] < arr[i + 1]))
            i++;

        if (i == 0 || i == l)
            return false;

        while (i < l && (arr[i] > arr[i + 1]))
            i++;

        return i == l;
    }
}
