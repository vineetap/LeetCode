package main.java;

import java.util.ArrayList;
import java.util.List;

public class _1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list=new ArrayList();
        int freq;
        int val;
        for(int i=0;i<nums.length;i=i+2){
            freq=nums[i];
            val=nums[i+1];

            for(int k=0;k<freq;k++)
                list.add(val);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
