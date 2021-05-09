package main.java;

import javafx.util.Pair;

import java.util.Stack;

 class MinStack {
        Stack<Integer> mainStack;
        Stack<Pair<Integer,Integer>> minStack;

        /** initialize your data structure here. */
        public MinStack() {
            mainStack=new Stack<Integer>();
            minStack=new Stack<Pair<Integer,Integer>>();
        }

        public void push(int val) {
            mainStack.push(val);

            if(minStack.isEmpty() || val<getMin())
                minStack.push(new Pair(val,1));
            else if(val==getMin()){
                Pair<Integer,Integer> minTop=minStack.pop();
                minStack.push(new Pair(minTop.getKey(),minTop.getValue()+1));
            }

        }

        public void pop() {
            int popVal= mainStack.pop();

            if(popVal==getMin()){
                Pair<Integer,Integer> minTop=minStack.pop();

                if(minTop.getValue()>1)
                    minStack.push(new Pair(minTop.getKey(),minTop.getValue()-1));
            }
        }

        public int top() {
            return mainStack.peek();
        }

        public int getMin() {
            return minStack.peek().getKey();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
