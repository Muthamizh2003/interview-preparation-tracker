package AssignmentSolutions.StringSoln.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/*
3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
Companies
Hint
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class LongSubwithNoRep {
    
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int maxlen=0;
        Set<Character> sets=new HashSet<>();
        for(int right=0;right<n;right++)
        {
            while(sets.contains(s.charAt(right)))
            {
                sets.remove(s.charAt(left)); 
                left++;
            }
            if(!sets.contains(s.charAt(right)))
                sets.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }   
        return maxlen; 
    }
}