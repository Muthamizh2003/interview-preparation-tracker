package StringSoln.Twoptrsoln;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
438. Find All Anagrams in a String
Solved
Medium
Topics
Companies
Given two strings s and p, return an array of all the start indices of p's 
anagrams
 in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 

Constraints:

1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters. 
 */
public class FindAllAnagrams {
    
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        } 
        List<Integer> list=new ArrayList<>(); 
        int start=0;
        int end=0;
        int n=s.length();
        int matched=0;
        while(end<n)
        {
            char r=s.charAt(end);
            if(map.containsKey(r)) 
            {
                map.put(r,map.get(r)-1);
                if(map.get(r)==0)
                {
                    matched++;
                }
            }
            if(end-start+1==p.length())
            {
                if(matched==map.size())
                {
                    list.add(start);
                }
                char l=s.charAt(start);
                if(map.containsKey(l))
                {
                    if(map.get(l)==0)
                    {
                        matched--;
                    }
                    map.put(l,map.get(l)+1);
                }
                start++;
            } 
            end++;   
        }
        return list;
    }
}