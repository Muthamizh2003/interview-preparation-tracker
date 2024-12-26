import java.util.ArrayList;
import java.util.List;
/*
78. Subsets
Solved
Medium
Topics
Companies
Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
 */

class Subset1 {
    public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res=new ArrayList<>();
            subset(nums,res,0,nums.length,new ArrayList<>());
            return res;    
        }
        private static void subset(int[] nums,List<List<Integer>> res,int start,int n,List<Integer> temp)
        {
            res.add(new ArrayList<>(temp));
            for(int i=start;i<n;i++)
            {
                System.out.println("Iteration "+i);
                temp.add(nums[i]);
                System.out.println(temp);
                
                subset(nums,res,i+1,n,temp);
                System.out.println("Iteration "+i);
                temp.remove(temp.size()-1);
                
                System.out.println(temp);
            }
        }
        public static void main(String[] args) {
            int[] nums={1,2,3};
            List<List<Integer>> res=subsets(nums);
            System.out.println(res);
    }
}