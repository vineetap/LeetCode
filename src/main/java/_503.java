package main.java;

import java.util.Arrays;
import java.util.Stack;

public class _503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] ngeNums=new int[nums.length];
        int l=nums.length;
        Stack<Integer> stack=new Stack();
        Arrays.fill(ngeNums,-1);

        for(int i=0;i<2*l;i++){

            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%l]){
                ngeNums[stack.pop()]=nums[i%l];
            }
            stack.push(i%l);

        }
        return ngeNums;
    }
}
