package main.java;

import java.util.HashMap;

public class _387 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;

            }
        }

        return -1;
    }
}
