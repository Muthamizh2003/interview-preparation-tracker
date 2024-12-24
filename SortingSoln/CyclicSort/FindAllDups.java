package SortingSoln.CyclicSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
442. Find All Duplicates in an Array
Medium
Topics
Companies
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
 */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int cur=nums[i];
            if(nums[i]!=nums[cur-1])
            {
                int t=nums[cur-1];
                nums[cur-1]=nums[i];
                nums[i]=t;
            }
            else 
                i++;
        }    
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=j+1)
                arr.add(nums[j]);
        }
        return arr; 
    }
}