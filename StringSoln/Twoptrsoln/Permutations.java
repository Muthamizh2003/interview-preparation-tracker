package StringSoln.Twoptrsoln;

import java.util.HashMap;
import java.util.Map;

/*
567. Permutation in String
Solved
Medium
Topics
Companies
Hint
Given two strings s1 and s2, return true if s2 contains a 
permutation
 of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
 */
public class Permutations {
    
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            s1map.put(s1.charAt(i),s1map.getOrDefault(s1.charAt(i),0)+1);
        }     
        int s=0;
        int e=0;
        int n=s2.length();
        Map<Character,Integer> s2map=new HashMap<>();
        while(e<n)
        {
            char c=s2.charAt(e);
            s2map.put(c,s2map.getOrDefault(c,0)+1);
            if(e-s+1==s1.length())
            {
                if(s2map.equals(s1map))
                {
                    return true;
                }
                else
                {
                    char c2=s2.charAt(s);
                    s2map.put(c2,s2map.get(c2)-1);
                    if(s2map.get(c2)==0)
                    {
                        s2map.remove(c2);
                    }
                    s++;
                }
            } 
            e++;
        }
        return false;
    }
}