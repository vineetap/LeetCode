package main.java;

import java.util.ArrayList;
import java.util.List;

public class _22 {
        List<String> result;
        public List<String> generateParenthesis(int n) {
            result=new ArrayList<String>();
            generateParenthesisRec(0,0,n,new StringBuilder(""));
            return result;
        }

        public void generateParenthesisRec(int open,int closed,int n,StringBuilder curr){

            if(open==n && closed==n){
                result.add(curr.toString());
                return;
            }

            if(open <n ) {
                generateParenthesisRec(open+1,closed,n,curr.append("("));
                curr.deleteCharAt(curr.length() - 1);
            }

            if(closed<open){
                generateParenthesisRec(open,closed+1,n,curr.append(")"));
                curr.deleteCharAt(curr.length() - 1);
            }

        }

    }
