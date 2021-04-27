package main.java;

import java.util.Stack;

public class _1249 {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<Integer>();
        char openPranthesis='(';
        char closedPranthesis=')';

        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<sb.length();i++){

            if(sb.charAt(i)==closedPranthesis){
                if(!stack.isEmpty() && sb.charAt(stack.peek())==openPranthesis)
                    stack.pop();
                else
                    stack.push(i);
            }
            else if(sb.charAt(i)==openPranthesis){
                stack.push(i);
            }

        }

        while(!stack.isEmpty()){
            sb.deleteCharAt(stack.pop());
        }

        return sb.toString();
    }
}
