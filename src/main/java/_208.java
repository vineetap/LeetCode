package main.java;

import java.util.HashMap;

public class _208 {

        TrieNode root;

        /** Initialize your data structure here. */
        public _208() {
            root=new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            if(word==null) return ;

            TrieNode node=root;
            TrieNode temp=null;
            for(char c: word.toCharArray()) {
                if(!node.charMap.containsKey(c))
                {
                    node.charMap.put(c,new TrieNode());
                }
                node=node.charMap.get(c);
            }

            node.isEnd=true;

        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            if(word==null) return false;

            TrieNode node=root;

            for(char c: word.toCharArray()){
                if(node.charMap.containsKey(c))
                    node=node.charMap.get(c);
                else
                    return false;
            }

            return node.isEnd==true;

        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            if(prefix==null) return false;

            TrieNode node=root;

            for(char c: prefix.toCharArray()){
                if(node.charMap.containsKey(c))
                    node=node.charMap.get(c);
                else
                    return false;
            }

            return true;

        }
    }


    class TrieNode{
        HashMap<Character,TrieNode> charMap;
        boolean isEnd=false;

        TrieNode(){
            charMap=new HashMap<Character,TrieNode>();
        }

    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

