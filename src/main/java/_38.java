package main.java;

import java.util.ArrayList;
import java.util.List;

public class _38 {
    public String countAndSay(int n) {
    List<String> l=new ArrayList<>();
        String res="1";

        for(int i=2;i<=n;i++){
            res=compress(res);
        }

        return res;
    }

    public String compress(String input){

        StringBuilder sb=new StringBuilder();
        int consecutive=0;

        for(int i=0;i<input.length();i++){

            consecutive++;

            if(i+1==input.length() || input.charAt(i)!= input.charAt(i+1) ){
                sb.append(consecutive);
                sb.append(input.charAt(i));

                consecutive=0;
            }
        }

        return sb.toString();
    }
}
