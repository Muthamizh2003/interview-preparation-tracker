//02. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length*2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=nums[i%nums.length];
        }   
        return arr; 
    }
}