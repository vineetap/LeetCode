package main.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _347 {

    //Hash Map sorting
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();

            //populate hash map with nums and frequency
            for(int n:nums){
                map.put(n,map.getOrDefault(n,0)+1);
            }

            List<Integer> result= map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(k).map(Map.Entry::getKey).collect(Collectors.toList());

            return result.stream().mapToInt(i -> i).toArray();
        }
    }
