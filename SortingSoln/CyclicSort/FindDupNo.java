package SortingSoln.CyclicSort;
/*
287. Find the Duplicate Number
Solved
Medium
Topics
Companies
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

Follow up:

How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity?
 */ 
class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int cur=nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[cur])
            {
                int t=nums[i];
                nums[i]=nums[cur];
                nums[cur]=t;
            }
            else
            {
                i++;
            }
        }   
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j)
                return nums[j];
        }
        return nums.length;       
    }
}