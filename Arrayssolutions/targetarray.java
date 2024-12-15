//07. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int a[]=new int[index.length];
        for(int i=0;i<nums.length;i++)
        {
            int temp;
            temp=index[i];
            for(int j=nums.length-1;j>temp;j--)
            {
              a[j]=a[j-1];
            }
             a[temp]=nums[i];
        }
        
        return a;
    }
}