//03. //[Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        for(i=1;i<nums.length;i++)
        {
             nums[i]+=nums[i-1];
        }
        return nums;
    }
}