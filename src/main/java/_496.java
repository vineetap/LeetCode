package main.java;

import java.util.Stack;

public class _496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack();
        int[] ngeNums2=new int[nums2.length];
        int[] ngeNums1=new int[nums1.length];

        int topIndex=-1;

        for(int i=0;i<nums2.length;i++){
            if(stack.isEmpty() || nums2[stack.peek()]>=nums2[i])
                stack.push(i);
            else{

                while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i]){
                    topIndex=stack.pop();
                    ngeNums2[topIndex]=nums2[i];
                }
                stack.push(i);
            }
        }

        while(!stack.isEmpty()){
            topIndex=stack.pop();
            ngeNums2[topIndex]=-1;
        }

       /*  for(int i=0;i<ngeNums2.length;i++){
             System.out.println(ngeNums2[i]);
         }*/

        for(int i=0;i<nums1.length;i++){
            int j=0;
            for(j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i])
                    break;
            }
            ngeNums1[i]=ngeNums2[j];
        }
        return ngeNums1;
    }
}
