package main.java;

import java.util.LinkedHashSet;

public class _NonLC4 {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 7, 8, 9, 9, 4, 1, 1};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
