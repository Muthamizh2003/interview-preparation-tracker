package StriversSheet.Arrays.Hard;

/*
Largest subarray with 0 sum
Difficulty: MediumAccuracy: 41.84%Submissions: 359K+Points: 4
Given an array arr containing both positive and negative integers, the task is to compute the length of the largest subarray that has a sum of 0.

Examples:

Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
Output: 5
Explanation: The largest subarray with a sum of 0 is [-2, 2, -8, 1, 7].
Input: arr[] = [2, 10, 4]
Output: 0
Explanation: There is no subarray with a sum of 0.
Input: arr[] = [1, 0, -4, 3, 1, 0]
Output: 5
Explanation: The subarray is [0, -4, 3, 1, 0].
Constraints:
1 ≤ arr.size() ≤ 106
−103 ≤ arr[i] ≤ 103, for each valid i
 */
//

/*
used pref sum map here
w.k.t  if i->0 nums[0]->15 so 15+2-2-8+1+7=15 so the value of the (curid)->5 - (map valueindex)->0=5-0=5
 */
//edge case if(pref==0) means the whole subarray is 0 so max=i+1
import java.util.HashMap;

class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int pref=0;
        for(int i=0;i<arr.length;i++)
        {
            pref+=arr[i];
            if(pref==0)
            {
                max=i+1;
            }
            if(map.containsKey(pref))
            {
                int previd=map.get(pref);
                max=Math.max(max,i-previd);
            }
            else
            {
                map.put(pref,i);
            }
        }
        return max;
    }
}