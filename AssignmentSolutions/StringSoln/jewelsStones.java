package AssignmentSolutions.StringSoln;

/*
771. Jewels and Stones
Solved
Easy
Topics
Companies
Hint
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 

Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
 */
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> sets=new HashSet<>();
        for(Character c:jewels.toCharArray())
        {
            sets.add(c);
        }
        int k=0;
        for(int i=0;i<stones.length();i++)
        {
            if(sets.contains(stones.charAt(i)))
            {
                k++;
            }
        }
        return k;
    }
}