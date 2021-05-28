package main.java;

import java.util.*;

public class _451 {
// Hashmap & Sort
        public String frequencySort(String s) {

            Map<Character,Integer> countMap=new HashMap<Character,Integer>();

            for(char c:s.toCharArray()){
                countMap.put(c,countMap.getOrDefault(c,0)+1);
            }

            List<Character> charList=new ArrayList<Character>(countMap.keySet());

            Collections.sort(charList,(c1, c2)->Integer.compare(countMap.get(c2),countMap.get(c1)));

            StringBuilder sb=new StringBuilder("");

            for(Character c:charList){
                int count=countMap.get(c);

                while(count>0){
                    sb.append(c);
                    count--;
                }

            }

            return sb.toString();
        }

        //Bucket Sort
            public String frequencySort2(String s) {

                Map<Character,Integer> countMap=new HashMap<Character,Integer>();

                for(char c:s.toCharArray()){
                    countMap.put(c,countMap.getOrDefault(c,0)+1);
                }

                int maxFrequency=Collections.max(countMap.values());
                List<List<Character>> buckets=new ArrayList<List<Character>>();

                //Init buckets
                for(int i=0;i<=maxFrequency;i++)
                {
                    buckets.add(new ArrayList<Character>());
                }

                for(Map.Entry<Character,Integer> e:countMap.entrySet())
                    buckets.get(e.getValue()).add(e.getKey());

                StringBuilder sb=new StringBuilder("");

                for(int i=maxFrequency;i>=1;i--){

                    for(Character c:buckets.get(i)) {
                        int count=i;
                        while(count>0){
                            sb.append(c);
                            count--;
                        }
                    }
                }

                return sb.toString();
            }
    }