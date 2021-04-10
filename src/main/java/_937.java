package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class _937 {
    public String[] reorderLogFiles(String[] logs) {

        List<String> digitsLogs=new ArrayList<String>();
        List<String> letterLogs=new ArrayList<String>();
        String[] split;

        String digits="0123456789";

        for(String s:logs){

            split=s.split(" ",2);

            if(digits.contains(String.valueOf(split[1].charAt(0))))
                digitsLogs.add(s);
            else
                letterLogs.add(s);
        }

        Collections.sort(letterLogs,(a, b) -> {
            String[] split1=a.split(" ",2);
            String[] split2=b.split(" ",2);

            int r= split1[1].compareTo(split2[1]);
            if(r!=0)
                return r;
            return split1[0].compareTo(split2[0]); //compare the identifier


        });

        letterLogs.addAll(digitsLogs);
        return letterLogs.stream().toArray(String[] ::new);

    }
}