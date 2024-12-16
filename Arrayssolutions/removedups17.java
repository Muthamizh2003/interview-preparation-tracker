//17. [Remove Duplicates from Sorted Array]
//(https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)
            return 1;
        int n=nums.length;
        int id=1;
        for(int i=1;i<nums.length;i++)    
        {
            if(nums[i-1]!=nums[i])
            {
                nums[id]=nums[i];
                id++;
            }
        }
        return id;
    }
}
