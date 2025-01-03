package Recursion;
/*
22. Generate Parentheses
Solved
Medium
Topics
Companies
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
 */
import java.util.ArrayList;
import java.util.List;
public class GenerateParanthesis69 {

    
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        backtrack(n, 0, 0, output, result);
        return result;
    }

    public void backtrack(int n, int left, int right, StringBuilder output, List<String> res) {
        if (left >= n && right >= n) {
            res.add(output.toString());
            return;
        }   
        if (left < n) {
            output.append("(");
            backtrack(n, left + 1, right, output, res);
            output.deleteCharAt(output.length() - 1);
        } 
        if (right < left) {
            output.append(")");
            backtrack(n, left, right + 1, output, res);
            output.deleteCharAt(output.length() - 1);
        }
    }
}