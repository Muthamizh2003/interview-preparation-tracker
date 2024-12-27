package AssignmentSolutions.StringSoln;

import java.util.HashMap;
import java.util.Map;

/*
1704. Determine if String Halves Are Alike
Solved
Easy
Topics
Companies
Hint
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
 

Constraints:

2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.
 */
public class StringHalves20 {
    
}
class Solution {
    public boolean halvesAreAlike(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);
        int k=s.length()/2;
        String a=s.substring(0,k);
        String b=s.substring(k);
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            if(map.containsKey(a.charAt(i)))
            {
                c++;
            }
        }
        int c2=0;  
        for(int i=0;i<b.length();i++)
        {
            if(map.containsKey(b.charAt(i)))
            {
                c2++;
            }
        } 
        return c==c2;   
    }
}