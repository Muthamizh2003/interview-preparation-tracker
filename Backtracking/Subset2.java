import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
90. Subsets II
Solved
Medium
Topics
Companies
Given an integer array nums that may contain duplicates, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
 */
public class Subset2 {
    
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        subset(nums,res,0,nums.length,new ArrayList<>());
        return res;    
    }
    private static void subset(int[] nums,List<List<Integer>> res,int start,int n,List<Integer> temp)
    {
        res.add(new ArrayList<>(temp));
        for(int i=start;i<n;i++)
        {
            if(i!=start&&nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            subset(nums,res,i+1,n,temp);
            temp.remove(temp.size()-1);
        }
    }
}