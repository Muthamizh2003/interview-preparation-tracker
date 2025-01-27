package Recursion;

import java.util.ArrayList;
import java.util.List;

/*
216. Combination Sum III
Solved
Medium
Topics
Companies
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

 

Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
Example 2:

Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.
Example 3:

Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
 

Constraints:

2 <= k <= 9
1 <= n <= 60
 */
public class CombinationSumIII27 {
    
}
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        int[] nums={1,2,3,4,5,6,7,8,9};
        backtrack(k,n,0,res,new ArrayList<>(),nums);
        return res;
    }
    private static void backtrack(int k,int n,int st,List<List<Integer>> res,List<Integer> temp,int[] nums)
    {
        int sum=0;
        for(int i=0;i<temp.size();i++)
        {
            sum+=temp.get(i);
        }
        if(temp.size()==k&&sum==n)
        {
            res.add(new ArrayList<>(temp));
        }
        else if(temp.size()>k)
        {
            return;
        }
        else
        {
            for(int i=st;i<nums.length;i++)
            {
                if(nums[i]==nums[i-1]&&i!=st)
                    continue;
                temp.add(nums[i]);
                backtrack(k,n,i+1,res,temp,nums);
                temp.remove(temp.size()-1);
            }
        }

    }
}