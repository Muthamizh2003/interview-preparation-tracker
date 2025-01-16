package Recursion;

import java.util.Arrays;

/*
1079. Letter Tile Possibilities
Solved
Medium
Topics
Companies
Hint
You have n  tiles, where each tile has one letter tiles[i] printed on it.

Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.

 

Example 1:

Input: tiles = "AAB"
Output: 8
Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
Example 2:

Input: tiles = "AAABBC"
Output: 188
Example 3:

Input: tiles = "V"
Output: 1
 

Constraints:

1 <= tiles.length <= 7
tiles consists of uppercase English letters.
 */
public class LetterTile41 {
    
}
class Solution {
    public int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];
        return backtrack(chars, used);
    }
    private int backtrack(char[] tiles, boolean[] used) {
        int count = 0;
        for (int i = 0; i < tiles.length; i++) {
            if (used[i] || (i > 0 && tiles[i] == tiles[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            count += 1 + backtrack(tiles, used);
            used[i] = false;
        }
        return count;
    }
}