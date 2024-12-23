//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

/*
448. Find All Numbers Disappeared in an Array
Solved
Easy
Topics
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
//using cyclic sort

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<Integer> findDisappearedNumberss(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int cur=nums[i]-1;
            if(nums[i]!=nums[cur])
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
        List<Integer> arr=new ArrayList<>(); 
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                arr.add(j+1);
            }
        }
        return arr;    
    }
}

class Solution2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List res = new ArrayList<Integer>();
        for(int i=0; i<len; i++) {
            int num = Math.abs(nums[i]) - 1;
            if(num>=0 && nums[num]>0) {
                nums[num] *= -1;
            }   
        }
        for(int i=0; i<len; i++) {
            if(nums[i]>0) {
                res.add(i+1);
            }
        }
        return res;    
    }
}