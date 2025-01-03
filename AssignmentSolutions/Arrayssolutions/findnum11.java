//12. [Find Numbers with Even Number of Digits]
//(https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
/*
Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105

 */
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            String s=Integer.toString(i);
            if(s.length()%2==0)
            {
                c++;
            }
        }    
        return c;
    }
}

//2.
class Solution2 {
    public int findNumbers(int[] nums) {
        int count = 0;
        int total = 0;
        for(int i : nums){
            count = 0;
            while(true){
                if(i<=0)
                    break;
                i/=10;
                count++;
            }
            count = count%2 == 0 ? 1: 0;
            total += count;
        }
        return total;
    }
}