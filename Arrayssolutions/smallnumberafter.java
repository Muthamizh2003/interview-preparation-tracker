//06. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]>nums[j])
                    count++;
            }
            res[i]=count;
        }
        return res;
    }
}