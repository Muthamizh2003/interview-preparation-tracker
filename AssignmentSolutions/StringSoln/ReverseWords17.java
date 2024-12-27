package AssignmentSolutions.StringSoln;
/*
557. Reverse Words in a String III
Solved
Easy
Topics
Companies
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.

 */
public class ReverseWords17 {
    
}
class Solution {
    public String reverseWords(String s) {
        String[] strs=s.split(" ");
        int i=0;
        for(String str:strs)
        {
            strs[i++]=reverse(str);
        }  
        return String.join(" ",strs);
    }
    private static String reverse(String s)
    {
        StringBuilder str=new StringBuilder(s);
        int l=0;
        int h=s.length()-1;
        while(l<=h)
        {
            char temp = str.charAt(l);
            str.setCharAt(l, str.charAt(h));
            str.setCharAt(h, temp);
            l++;
            h--;
        }
        return str.toString();
    }
}