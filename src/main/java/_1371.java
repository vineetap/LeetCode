package main.java;

import java.util.Arrays;

public class _1371 {
        public int findTheLongestSubstring(String s) {
            int result=0;

            char[] vowelPositions = {1,0,0,0,2,0,0,0,4,0,0,0,0,0,8,0,0,0,0,0,16,0,0,0,0,0};

            int mask=0;
            int[] vowelCount=new int[32]; //This is count array. Since we have 5 vowels so combination of bit set/unset for these will be 32
            Arrays.fill(vowelCount,-1);

            for(int i=0;i<s.length();i++){
                mask^= vowelPositions[s.charAt(i)-'a'];

                if (mask != 0 && vowelCount[mask] == -1) // mask =0 meaning all consonants
                    vowelCount[mask] = i;
                result=Math.max(result,i-vowelCount[mask]);
            }

            return result;
        }
    }

