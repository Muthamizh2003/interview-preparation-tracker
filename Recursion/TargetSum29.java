package Recursion;
/*
494. Target Sum
Solved
Medium
Topics
Companies
You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

 

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1
 

Constraints:

1 <= nums.length <= 20
0 <= nums[i] <= 1000
0 <= sum(nums[i]) <= 1000
-1000 <= target <= 1000
 */
public class TargetSum29 {
    
}
//backtracking
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findsum(nums,0,nums.length,target,0);      
    }
    private static int findsum(int[] nums,int start,int n,int target,int cur)
    {
        if(start==n)
        {
            return target==cur?1:0;
        }
        int add=findsum(nums,start+1,n,target,cur+nums[start]);
        int sub=findsum(nums,start+1,n,target,cur-nums[start]);
        return add+sub;
    }
}
//with memorization

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return findCount(nums, 0, 0, target, memo);
    }

    private int findCount(int[] nums, int index, int currentSum, int target, Map<String, Integer> memo) {
        if (index == nums.length) {
            return currentSum == target ? 1 : 0;
        }

        String key = index + "," + currentSum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int add = findCount(nums, index + 1, currentSum + nums[index], target, memo);
        int subtract = findCount(nums, index + 1, currentSum - nums[index], target, memo);

        int result = add + subtract;
        memo.put(key, result);

        return result;
    }
}
