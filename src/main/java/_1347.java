package main.java;

public class _1347 {
        public int minSteps(String s, String t) {
            int[] sCount=new int[26];

            for(char sChar:s.toCharArray())
                sCount[sChar-'a']++;

            for(char tChar:t.toCharArray())
                sCount[tChar-'a']--;

            int minSteps=0;
            for(int m:sCount)
            {
                if(m!=0)
                    minSteps+=Math.abs(m);
            }

            return minSteps/2; // Since we counted both surplus & deficient chars - which was not needed to be double counted
        }
    }
