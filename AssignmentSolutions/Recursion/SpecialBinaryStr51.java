package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
761. Special Binary String
Solved
Hard
Topics
Companies
Hint
Special binary strings are binary strings with the following two properties:

The number of 0's is equal to the number of 1's.
Every prefix of the binary string has at least as many 1's as 0's.
You are given a special binary string s.

A move consists of choosing two consecutive, non-empty, special substrings of s, and swapping them. Two strings are consecutive if the last character of the first string is exactly one index before the first character of the second string.

Return the lexicographically largest resulting string possible after applying the mentioned operations on the string.

 

Example 1:

Input: s = "11011000"
Output: "11100100"
Explanation: The strings "10" [occuring at s[1]] and "1100" [at s[3]] are swapped.
This is the lexicographically largest string possible after some number of swaps.
Example 2:

Input: s = "10"
Output: "10"
 

Constraints:

1 <= s.length <= 50
s[i] is either '0' or '1'.
s is a special binary string.
 */
public class SpecialBinaryStr51 {
}
class Solution {
    public String makeLargestSpecial(String s) {
        int count=0;
        int index=0;
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='1') count++;
            else count--;
            if(count==0) {
                list.add("1"+makeLargestSpecial(s.substring(index+1,i))+"0");
                index=i+1;
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for(String str:list) {
            sb.append(str);
        }
        return sb.toString();
    }
}