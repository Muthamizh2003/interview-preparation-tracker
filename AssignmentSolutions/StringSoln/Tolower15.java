package AssignmentSolutions.StringSoln;
/*
709. To Lower Case
Solved
Easy
Topics
Companies
Hint
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 

Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.
 */
public class Tolower15 {
    
}
class Solution {
    public String toLowerCase(String s) {
        char[] arr=s.toCharArray();
        for (int i=0;i<=arr.length-1;i++)
         {
            if ('A'<=arr[i]&&arr[i]<='Z') 
            {
                arr[i]=(char)(arr[i]+32);
            }

        }
        return String.valueOf(arr);
    }
}