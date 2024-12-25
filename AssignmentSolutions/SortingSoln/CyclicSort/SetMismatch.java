package AssignmentSolutions.SortingSoln.CyclicSort;

import java.util.ArrayList;

/*
645. Set Mismatch
Solved
Easy
Topics
Companies
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104
 */
public class SetMismatch {
    
}
class Solution {
    public int[] findErrorNums(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            if (arr[absValue - 1] > 0) {
                arr[absValue - 1] = -arr[absValue - 1];
            } else {
                result.add(absValue);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result.add(i + 1);
                break;
            }
        }

        int[] ans=new int[2];
        for(int i=0;i<result.size();i++)
        {
            ans[i]=result.get(i);
        }    
        return ans;
    }
}