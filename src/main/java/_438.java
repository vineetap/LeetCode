package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _438 {
        public List<Integer> findAnagrams(String s, String p) {
            int sLen=s.length();
            int pLen=p.length();

            if(pLen>sLen)
                return new ArrayList<Integer>();

            //count array for p
            int[] pCount=new int[26];
            int[] sCount=new int[26];
            List<Integer> result=new ArrayList<Integer>();

            for(char pChar:p.toCharArray())
                pCount[pChar-'a']++;

            for(int i=0;i<sLen;i++){

                sCount[s.charAt(i)-'a']++;

                if(i>=pLen)
                    sCount[s.charAt(i-pLen)-'a']--;

                if(Arrays.equals(sCount,pCount))
                    result.add(i-pLen+1);

            }

            return result;
        }
    }
