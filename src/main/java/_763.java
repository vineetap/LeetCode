package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result=new ArrayList<Integer>();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int nextSplit;
        int init=0;


        for(int i=0;i<S.length();i++)
            hm.put(S.charAt(i),i);


        for(int i=0;i<S.length();i++){
            nextSplit=hm.get(S.charAt(i));

            while(i!=nextSplit){
                if(hm.get(S.charAt(i))>nextSplit)
                    nextSplit=hm.get(S.charAt(i));
                i++;
            }
            result.add(nextSplit-init+1);
            init=nextSplit+1;

        }

        return result;
    }
}
