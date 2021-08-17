package main.java;

import java.util.Stack;

public class _84 {
        public int largestRectangleArea(int[] heights) {
            Stack<Integer> stack=new Stack();
            int len=heights.length;
            int i=0;
            int maxArea=0;

            while(i<len){

                while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                    maxArea=Math.max(maxArea,heights[stack.pop()] * (i - (stack.isEmpty() ? 0 : stack.peek() + 1)));
                }
                stack.push(i++);
            }

            //took from len because of the other heights from right of the syack's peek is bigger
            while(!stack.isEmpty()){
                maxArea=Math.max(maxArea,heights[stack.pop()] * (len - (stack.isEmpty() ? 0 : stack.peek() + 1)));

            }
            return maxArea;

        }

}
