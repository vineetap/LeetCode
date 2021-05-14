package main.java;

import java.util.ArrayList;
import java.util.List;

public class _816 {
        List<String> result=new ArrayList<String>();

        public List<String> ambiguousCoordinates(String s) {
            //Removing braces from input string
            s=s.substring(1,s.length()-1);

            //Breaking the string in x & y
            for(int i=1;i<s.length();i++){
                helper(s.substring(0,i),s.substring(i));
            }

            return result;
        }

        public void helper(String xStr, String yStr){
            List<String> xList=putDecimal(xStr);
            List<String> yList=putDecimal(yStr);

            for(String x:xList){
                if(isValid(x)){
                    for(String y:yList){
                        if(isValid(y)){
                            result.add("("+x+", "+y+")");
                        }
                    }
                }
            }

        }

        public List<String> putDecimal(String s) {
            List<String> res=new ArrayList<String>();
            res.add(s);  // Add Strin without .
            for(int i=1;i<s.length();i++){
                res.add(s.substring(0,i)+"."+s.substring(i));
            }

            return res;
        }

        public boolean isValid(String s){
            if(s.contains(".")){
                String[] splitted=s.split("\\.");
                if(!"0".equals(splitted[0]) &&  splitted[0].startsWith("0")) return false;
                else return !splitted[1].endsWith("0");
            }
            else{
                if("0".equals(s)) return true;
                else return !s.startsWith("0");
            }
        }
    }
