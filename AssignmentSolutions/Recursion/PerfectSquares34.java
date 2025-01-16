import java.util.HashMap;
import java.util.Map;
/*
279. Perfect Squares
Solved
Medium
Topics
Companies
Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

 

Example 1:

Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 

Constraints:

1 <= n <= 104
 */
public class PerfectSquares34 {
    
}
class Solution {
    public int numSquares(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return min(n, map);        
    }

    private static int min(int n, Map<Integer, Integer> map) {
        if (n < 0) return Integer.MAX_VALUE;
        if (n == 0) return 0;
        if (map.containsKey(n)) {
            return map.get(n);
        }

        int result = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            result = Math.min(result, 1 + min(n - i * i, map));
        }

        map.put(n, result);
        return result;
    }
}