package main.java;

import javafx.util.Pair;

import java.util.Stack;

public class _901 {
    Stack<Pair<Integer,Integer>> stack;
    public _901() {
        stack=new Stack<>();
    }

    public int next(int price) {
        int result=1;
        while(!stack.isEmpty() && stack.peek().getKey()<=price){
            result+=stack.pop().getValue();
        }
        stack.push(new Pair(price,result));

        return result;
    }
}
