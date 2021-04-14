package main.java;

import java.util.HashSet;
import java.util.Set;

public class _1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set=new HashSet();

        for(int n:arr){

            if(set.contains(n*2)||(set.contains(n/2)&&n%2==0)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
