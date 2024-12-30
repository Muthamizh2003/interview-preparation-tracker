import java.util.ArrayList;
import java.util.List;
/*
77. Combinations
Solved
Medium
Topics
Companies
Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

You may return the answer in any order.

 

Example 1:

Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
Example 2:

Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.
 

Constraints:

1 <= n <= 20
1 <= k <= n

 */
public class Combunation {
    
}
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>(), 0, k);
        return res;
    }

    private static void backtrack(int[] nums, List<List<Integer>> res, List<Integer> arr, int start, int k) {
        if (arr.size() == k) {
            res.add(new ArrayList<>(arr)); 
            return;
        }

        for (int i = start; i < nums.length; i++) {
            arr.add(nums[i]); 
            backtrack(nums, res, arr, i + 1, k); 
            arr.remove(arr.size() - 1); 
        }
    }
}
