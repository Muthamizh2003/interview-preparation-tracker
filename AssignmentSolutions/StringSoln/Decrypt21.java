package AssignmentSolutions.StringSoln;
/*
1309. Decrypt String from Alphabet to Integer Mapping
Solved
Easy
Topics
Companies
Hint
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
 

Constraints:

1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.
 */
public class Decrypt21 {
    
}
class Solution {
    public String freqAlphabets(String s) {
        int l=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0,j;i<l;i++){
            char ch;
            j=i+2;
            if(j<l&&s.charAt(j)=='#'){
                char c1=s.charAt(i);
                char c2=s.charAt(i+1);
                int c3=Character.getNumericValue(c1)*10+Character.getNumericValue(c2);
                ch=(char)('a'+c3-1);
                i+=2;
            }else{
                char c1=s.charAt(i);
                int c2=Character.getNumericValue(c1);
                ch=(char)('a'+c2-1);
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}