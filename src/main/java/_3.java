package main.java;

import java.util.HashMap;

public class _3 {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

        for(int j=0,i=0;j<s.length();j++){    // i is the start index of sub-string considered

            if(hm.containsKey(s.charAt(j))){
                i=Math.max(hm.get(s.charAt(j)),i); //Since not removing characters from Map - if Map has the    character but it is not in out current window then i
            }

            result=Math.max(result,j-i+1);
            hm.put (s.charAt(j),j+1); // " " or single character cases
        }

        return result;
    }
}
