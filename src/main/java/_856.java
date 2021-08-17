package main.java;

import java.util.Stack;

public class _856 {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack();
        int cur=0;
        for(char c:s.toCharArray()){
            if(c=='(')
            {
                stack.push(cur);
                cur=0;
            }
            else{
                cur=stack.pop()+Math.max(2*cur,1);

            }
        }

        return cur;
    }
}
