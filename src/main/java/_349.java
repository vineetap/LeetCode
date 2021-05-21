package main.java;

import java.util.*;

public class _349 {
 // Two Pionter
        public int[] intersection2(int[] nums1, int[] nums2) {
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
                if(n1==n2){
                    output[index++]=n1;
                    while(ptr1<nums1.length && nums1[ptr1]==n1)
                        ptr1++;
                    while(ptr2<nums2.length && nums2[ptr2]==n2)
                        ptr2++;

                } else if(n1<n2){
                    ptr1++;
                }
                else
                    ptr2++;
            }

            return Arrays.copyOfRange(output, 0, index); // to return the index that are filled
        }


    //RetainAll
        public int[] intersection1(int[] nums1, int[] nums2) {
            Integer[] n1=Arrays.stream(nums1).boxed().toArray(Integer[]::new);
            Integer[] n2=Arrays.stream(nums2).boxed().toArray(Integer[]::new);
            Set<Integer> set1=new HashSet<Integer>(Arrays.asList(n1));
            Set<Integer> set2=new HashSet<Integer>(Arrays.asList(n2));

            set1.retainAll(set2);

            int[] output=new int[set1.size()];
            int index=0;

            for(int n:set1)
                output[index++]=n;

            return output;
        }


    // Using HAshMap
        public int[] intersection(int[] nums1, int[] nums2) {

            if(nums1.length>nums2.length)
                return intersection(nums2,nums1);

            HashMap<Integer,Integer> hm=new HashMap();
            for(int n :nums1)
                hm.put(n,hm.getOrDefault(n,1)+1);

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
