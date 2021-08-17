package main.java;

import java.util.Stack;

public class _739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ngeTemperature =new int[temperatures.length];
        Stack<Integer> stack=new Stack();
        int top;
        for(int i=0;i<temperatures.length;i++){

            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                top=stack.pop();
                ngeTemperature[top]=i-top;
            }

            stack.push(i);

            //System.out.println(stack.toString());
        }
        return ngeTemperature;
    }
}
