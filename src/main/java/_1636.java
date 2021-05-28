package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1636 {
        public int[] frequencySort(int[] nums) {
            Map<Integer,Integer> countMap=new HashMap<Integer,Integer>();

            for(int n:nums){
                countMap.put(n,countMap.getOrDefault(n,0)+1);
            }

            return Arrays.stream(nums).boxed().sorted((n1,n2) ->countMap.get(n1)==countMap.get(n2)?Integer.compare(n2,n1):Integer.compare(countMap.get(n1),countMap.get(n2))).mapToInt(i->i).toArray();

        }
    }