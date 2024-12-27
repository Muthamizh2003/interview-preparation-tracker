package AssignmentSolutions.StringSoln;
/*
1832. Check if the Sentence Is Pangram
Solved
Easy
Topics
Companies
Hint
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */
public class Pangram {
    
}
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans[] =new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            ans[sentence.charAt(i)-97]=true;
        }
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]==false)
                return false;
        }
        return true;
    }
}