package main.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
* */
public class _340 {
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
            int maxLen=0;

            Map<Character,Integer> freqMap=new HashMap<Character,Integer>();

            for(int end=0,start=0;end<s.length()&&start<=end;end++)
            {
                freqMap.put(s.charAt(end),end);

                if(freqMap.size()>k){
                    int lowestIndex= Collections.min(freqMap.values());
                    start=lowestIndex+1;
                    freqMap.remove(s.charAt(lowestIndex));
                }

                maxLen=Math.max(maxLen,end-start+1);

            }

            return maxLen;
        }
    }
