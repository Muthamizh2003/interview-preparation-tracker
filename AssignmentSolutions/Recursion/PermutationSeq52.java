/*
60. Permutation Sequence
Solved
Hard
Topics
Companies
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"
 

Constraints:

1 <= n <= 9
1 <= k <= n!
 */

   

import java.util.ArrayList;
import java.util.List;
public class PermutationSeq52 {
    
}
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        k--;
        StringBuilder sb = new StringBuilder();
        findKthPermutation(nums, k, sb);
        return sb.toString();
    }

    private static void findKthPermutation(List<Integer> nums, int k, StringBuilder sb) {
        if (nums.isEmpty()) {
            return;
        }
        int n = nums.size();
        int fact = factorial(n - 1);
        int index = k / fact;
        sb.append(nums.get(index));
        nums.remove(index);
        k = k % fact;
        findKthPermutation(nums, k, sb);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;

        return fact;
    }
}