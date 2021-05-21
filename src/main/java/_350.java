package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _350 {
    // Two pointers
        public int[] intersect1(int[] nums1, int[] nums2) {
            Arrays.sort(nums1); // if sorted ignore
            Arrays.sort(nums2); //if sorted ignore
            int ptr1=0;
            int ptr2=0;
            int outputLen1=nums1.length>nums2.length?nums1.length:nums2.length;
            int[] output=new int[outputLen1];
            int index=0;
            while(ptr1<nums1.length && ptr2<nums2.length){
                int n1=nums1[ptr1];
                int n2=nums2[ptr2];
                if(n1<n2)
                    ptr1++;
                else if(n1>n2)
                    ptr2++;
                else{
                    output[index++]=n1;
                    ptr1++;
                    ptr2++;
                }
            }

            return Arrays.copyOfRange(output, 0, index); // to return the index that are filled

        }


    //HashMap
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            return intersect(nums2,nums1);

        HashMap<Integer,Integer> hm=new HashMap();
        for(int n :nums1)
            hm.put(n,hm.getOrDefault(n,0)+1);

        List<Integer> list=new ArrayList();

        for(int n :nums2){
            int count=hm.getOrDefault(n,0);

            if(count>0){
                list.add(n);
                hm.put(n,count-1);

            }
        }

        int[] output=new int[list.size()];
        int i=0;
        for(int n:list)
            output[i++]=n;

        return output;

    }
}
