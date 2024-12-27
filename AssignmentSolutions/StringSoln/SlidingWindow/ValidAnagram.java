package AssignmentSolutions.StringSoln.SlidingWindow;
/*
242. Valid Anagram
Solved
Easy
Topics
Companies
Given two strings s and t, return true if t is an 
anagram
 of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
public class ValidAnagram {
    
}
class Solution {
    public boolean isAnagram(String s, String t) {
    int x=s.length();
    int y=t.length();
    if(x!=y)
        return false;
    else
    {
        int[] str=new int[26];
        for(int i=0;i<x;i++)
        {
            str[s.charAt(i)-'a']++;    
        }
        for(int i=0;i<t.length();i++)
        {
            str[t.charAt(i)-'a']--;    
            if(str[t.charAt(i)-'a']<0)
            {
                return false;
            }
        }
    }
    return true;
    }
}