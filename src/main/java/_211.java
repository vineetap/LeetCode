package main.java;

import java.util.HashMap;

public class _211 {
    TrieNode1 root;
    /** Initialize your data structure here. */
    public _211() {
        root=new TrieNode1();
    }

    public void addWord(String word) {
        if(word==null) return;
        TrieNode1 node=root;
        for(char c:word.toCharArray()){
            if(!node.hm.containsKey(c))
                node.hm.put(c,new TrieNode1());

            node=node.hm.get(c);
        }

        node.isTrue=true;
    }

    public boolean search(String word) {
        return searchWord(word,root);

    }

    public boolean searchWord(String word, TrieNode1 node){
        for(int i=0;i<word.length();i++){

            if(!node.hm.containsKey(word.charAt(i))){
                if(word.charAt(i)=='.'){
                    for(char c:node.hm.keySet()){
                        if(searchWord(word.substring(i+1),node.hm.get(c)))
                            return true;
                    }
                }
                return false;
            }
            else
                node=node.hm.get(word.charAt(i));
        }

        return node.isTrue;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

class TrieNode1{
    boolean isTrue=false;
    HashMap<Character,TrieNode1> hm;

    public TrieNode1(){
        hm=new HashMap<Character,TrieNode1>();
    }
}
