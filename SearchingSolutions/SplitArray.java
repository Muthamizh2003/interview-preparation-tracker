/*
410. Split Array Largest Sum
Solved
Hard
Topics
Companies
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
 

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= k <= min(50, nums.length)
 */
public class SplitArray {
    
}
class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int h=0;
        for(int i:nums)
        {
            l=Math.max(l,i);
            h+=i;
        }    
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            int part=countparts(nums,mid);
            if(part<=k)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
    private static int countparts(int[] nums,int sum)
    {
        int v=1;
        int cur=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]+cur<=sum)
            {
                cur+=nums[i];
            }   
            else
            {
                v++;
                cur=nums[i];
            }
        }
        return v;
    }
}