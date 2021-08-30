package main.java;

import java.util.ArrayList;
import java.util.List;

public class _1239 {
    public int maxLength(List<String> arr) {
        List<Integer> nonDupList=new ArrayList();
        nonDupList.add(0);
        int result=0;
        for(String s:arr){
            int dups=0;int a=0;

            //To check if s itself has duplicate characters- if yes we have to skip it
            for(char c:s.toCharArray()){
                dups|= a & (1<< (c-'a'));
                a|=(1<< (c-'a'));
            }

            if(dups>0) continue;

            //Iterate already visited List to Check if current string has chars that are already present in our visited list
            for(int i=nonDupList.size()-1;i>=0;i--){
                if((nonDupList.get(i)&a )>0)
                    continue;
                nonDupList.add(nonDupList.get(i)|a);
                result=Math.max(result,Integer.bitCount(nonDupList.get(i)|a));
            }
        }

        return result;
    }
}
