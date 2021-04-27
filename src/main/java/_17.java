package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _17 {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<String>();
        String[] digitLetters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


        if(digits.length()==0)
            return result;

        result.add("");

        for(int i=0;i<digits.length();i++)
            result=combine(digitLetters[digits.charAt(i)-'0'],result);

        return result;
    }

    public List<String> combine(String letters,List<String> result){
        List<String> r=new ArrayList<String>();

        for(String res:result)
            for(int i=0;i<letters.length();i++)
                r.add(res+letters.charAt(i));

        return r;
    }
}

/** Backtracking Solution

class Solution {
    private List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    private String phoneDigits;

    public List<String> letterCombinations(String digits) {
        // If the input is empty, immediately return an empty answer array
        if (digits.length() == 0) {
            return combinations;
        }

        // Initiate backtracking with an empty path and starting index of 0
        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }

    private void backtrack(int index, StringBuilder path) {
        // If the path is the same length as digits, we have a complete combination
        if (path.length() == phoneDigits.length()) {
            combinations.add(path.toString());
            return; // Backtrack
        }

        // Get the letters that the current digit maps to, and loop through them
        String possibleLetters = letters.get(phoneDigits.charAt(index));
        for (char letter: possibleLetters.toCharArray()) {
            // Add the letter to our current path
            path.append(letter);
            // Move on to the next digit
            backtrack(index + 1, path);
            // Backtrack by removing the letter before moving onto the next
            path.deleteCharAt(path.length() - 1);
        }
    }
}
 **/