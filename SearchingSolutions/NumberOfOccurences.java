/*
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

Examples :

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.
Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
1 ≤ target ≤ 106


 */

public class NumberOfOccurences {
    
}

class Solution {
    int countFreq(int[] nums,int target) {
        // code here
        int l=lowerbound(nums,target);
        int r=upperbound(nums,target);
        if(l==-1&&r==-1)
        {
            return 0;
        }
        return r-l+1;
    }
    private static int lowerbound(int[] nums,int target)
    {
        int l=0;
        int r=nums.length-1;
        int val=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                val=mid;
                r=mid-1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return val;
    }
    private static int upperbound(int[] nums,int target)
    {
        int l=0;
        int r=nums.length-1;
        int val=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                val=mid;
                l=mid+1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return val;
    }
}

