package main.java;

import java.util.*;

public class _127 {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> wordSet=new HashSet<String>(wordList);

            Queue<String> q=new ArrayDeque<String>();
            int level=1;

            q.offer(beginWord);

            while(!q.isEmpty()){
                int qSize=q.size();

                for(int i=1;i<=qSize;i++){
                    String currWord=q.poll();

                    //check if end is present in wordList
                    if(currWord.equals(endWord))
                        return level;

                    for(String neighbour:neighbors(currWord,wordSet)){
                        q.offer(neighbour);
                    }

                }
                level++;
            }

            return 0;
        }

        public List<String> neighbors(String s, Set<String> wordSet){
            List<String> res = new LinkedList<>();
            for(int i=0;i<s.length();i++){
                char [] chars = s.toCharArray();
                for(char ch = 'a'; ch <= 'z'; ch++){
                    chars[i] = ch;
                    String word = new String(chars);
                    if(wordSet.contains(word)){
                        res.add(word);
                        wordSet.remove(word);
                    }
                }
            }
            return res;
        }
    }
