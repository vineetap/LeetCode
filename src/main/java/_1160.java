package main.java;

import java.util.HashMap;

public class _1160 {
    public int countCharacters(String[] words, String chars) {
        int resultLen = 0;
        boolean diffFlag = true;
        if (chars == null || chars.length() == 0 || words == null || words.length == 0)
            return resultLen;

        HashMap<Character, Integer> charsMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charsMapClone;
        for (char c : chars.toCharArray()) {
            charsMap.put(c, charsMap.getOrDefault(c, 0) + 1);
        }

        for (String word : words) {
            charsMapClone = (HashMap<Character, Integer>) charsMap.clone();
            diffFlag = true;
            for (int i = 0; i < word.length(); i++) {
                if (charsMapClone.get(word.charAt(i)) == null || charsMapClone.getOrDefault(word.charAt(i), 0) <= 0)
                    diffFlag = false;
                else {
                    charsMapClone.put(word.charAt(i), charsMapClone.getOrDefault(word.charAt(i), 0) - 1);

                }
            }

            if (diffFlag) {
                resultLen += word.length();
            }

        }

        return resultLen;
    }
}
