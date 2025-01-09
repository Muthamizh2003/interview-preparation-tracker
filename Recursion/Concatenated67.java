package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
472. Concatenated Words
Solved
Hard
Topics
Companies
Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.

A concatenated word is defined as a string that is comprised entirely of at least two shorter words (not necessarily distinct) in the given array.

 

Example 1:

Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
Example 2:

Input: words = ["cat","dog","catdog"]
Output: ["catdog"]
 

Constraints:

1 <= words.length <= 104
1 <= words[i].length <= 30
words[i] consists of only lowercase English letters.
All the strings of words are unique.
1 <= sum(words[i].length) <= 105
 */
public class Concatenated67 {
    
}
class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> sets = new HashSet<>();
        Set<String> dictionary = new HashSet<>();

        for (String word : words) {
            dictionary.add(word);
        }

        Map<String, Boolean> memo = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                if (canForm(word, dictionary, memo)) {
                    sets.add(word);
                }
            }
        }

        return new ArrayList<>(sets);
    }

    private boolean canForm(String word, Set<String> dictionary, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }

        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (dictionary.contains(prefix) && (dictionary.contains(suffix) || canForm(suffix, dictionary, memo))) {
                memo.put(word, true);
                return true;
            }
        }

        memo.put(word, false);
        return false;
    }
}
