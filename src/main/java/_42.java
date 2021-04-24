package main.java;

import java.util.Stack;

public class _42 {
     public int trap(int[] height) {
            Stack<Integer> stack=new Stack();
            int area=0;
            int oldTop;
            int boundedDistance;
            int minHeight;
            for (int i = 0; i < height.length; i++) {
                while(!stack.isEmpty() && height[i]>height[stack.peek()]){
                    oldTop=stack.pop();
                    if(stack.isEmpty())
                        break;
                    boundedDistance=i-stack.peek()-1;
                    minHeight=Math.min(height[i],height[stack.peek()])-height[oldTop];
                    area+=(minHeight*boundedDistance);
                }
                stack.push(i);
            }

            return area;

        }
}
