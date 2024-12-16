//20. [Find First and Last Position of Element in Sorted Array]
//(https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int l=lowerbound(nums,target);
        int r=upperbound(nums,target);
        if(l!=-1&&r!=-1)
        {
            return new int[]{l,r};
        }
        return new int[]{-1,-1};
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
