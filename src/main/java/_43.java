package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class _43 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<String,List<String>>();
        int[] count=new int[26];

        for(String s:strs){

            StringBuilder key=new StringBuilder("");
            Arrays.fill(count,0);

            for(char c:s.toCharArray())
                count[c-'a']++;

            for(int i=0;i<26;i++){
                key.append("#");
                key.append(count[i]);
            }

            if(!hm.containsKey(key.toString()))
                hm.put(key.toString(),new ArrayList());
            hm.get(key.toString()).add(s);

        }

        return hm.values().stream().collect(Collectors.toList());
    }
}