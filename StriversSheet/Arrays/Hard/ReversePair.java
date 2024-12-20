package StriversSheet.Arrays.Hard;
/*
493. Reverse Pairs
Solved
Hard
Topics
Companies
Hint
Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 

Constraints:

1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1
 */
public class ReversePair {
    
}
//O(2nlogn)
//O(n) =>destorting the input here
class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);        
    }
    private static int mergesort(int[] nums,int l,int r)
    {
        int cnt=0;
        if(l>=r)return cnt;
        int mid=l+(r-l)/2;
        cnt+=mergesort(nums,l,mid);
        cnt+=mergesort(nums,mid+1,r);
        cnt+=countpairs(nums,l,mid,r);
        merge(nums,l,mid,r);
        return cnt;
    }
    private static void merge(int[] nums,int l,int mid,int r)
    {
        int[] temp=new int[r-l+1];
        int left=l;
        int right=mid+1;
        int k=0;
        while(left<=mid&&right<=r)
        {
            if(nums[left]<=nums[right])
            {
                temp[k++]=nums[left++];
            }
            else
            {
                temp[k++]=nums[right++];
            }
        }  
        while(left<=mid)
        {
            temp[k++]=nums[left++];
        }
        while(right<=r)
        {
            temp[k++]=nums[right++];
        }
        for(int i=l;i<=r;i++)
        {
            nums[i]=temp[i-l];
        }
    }
    private static int countpairs(int[] nums,int l,int mid,int r)
    {
        int right=mid+1;
        int cnt=0;
        for(int i=l;i<=mid;i++)
        {
            while(right<=r&&(long)nums[i]>2*(long)nums[right])
            {
                right++;
            }
            cnt+=(right-(mid+1));
        }
        return cnt;
    }
}