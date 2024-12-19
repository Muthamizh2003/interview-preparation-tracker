package StriversSheet.Arrays.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
229. Majority Element II
Medium
Topics
Companies
Hint
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */

 //1.HashMap
 class Solution1 {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }           
        int n=nums.length;
        n=n/3;
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>n)
            {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}

//2.Boyer-Moore Voting Algorithm -> O(1)

//there can be atmost 2 values at the arr with n/2



class Solution2 {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        int ele1 = 0, ele2 = 0;

        for (int num : nums) {
            if (num == ele1) {
                c1++;
            } else if (num == ele2) {
                c2++;
            } else if (c1 == 0) {
                ele1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                ele2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == ele1) count1++;
            else if (num == ele2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(ele1);
        if (count2 > n / 3) result.add(ele2);

        Collections.sort(result);
        return result;
    }
}
