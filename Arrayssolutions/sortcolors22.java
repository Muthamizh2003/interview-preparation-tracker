//22. [Sort Colors](https://leetcode.com/problems/sort-colors/)
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int cur=0;
        int high=nums.length-1;
        while(cur<=high)
        {
            if(nums[cur]==0)
            {
                int temp=nums[cur];
                nums[cur]=nums[low];
                nums[low]=temp;
                low++;
                cur++;
            }
            else if(nums[cur]==1)
            {
                cur++;
            }
            else
            {
                int temp=nums[cur];
                nums[cur]=nums[high];
                nums[high]=temp;
                high--;    
            }
        }    
    }
}