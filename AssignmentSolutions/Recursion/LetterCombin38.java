package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
17. Letter Combinations of a Phone Number
Solved
Medium
Topics
Companies
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */
public class LetterCombin38 {
    
}
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        backtrack(result, digits, "", 0, map);

        return result;
    }
    private void backtrack(List<String> result, String digits, String current, int index, HashMap<Character, String> map) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for (char c : letters.toCharArray()) {
            backtrack(result, digits, current + c, index + 1, map);
        }
    }
}