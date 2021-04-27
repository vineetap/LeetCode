package main.java;

import java.util.HashMap;
import java.util.Stack;

public class _20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        HashMap<Character,Character> map=new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');


        for(char c:s.toCharArray()){

            if(map.containsValue(c)) //open paranthesis
                stack.push(c);
            if(map.containsKey(c)) //closing paranthesis
            {
                if(!stack.isEmpty() && stack.peek()==map.get(c) )  // matching
                    stack.pop();
                else
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
