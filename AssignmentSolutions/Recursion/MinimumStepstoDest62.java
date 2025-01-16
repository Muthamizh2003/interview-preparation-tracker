/*
Minimum steps to destination
Difficulty: MediumAccuracy: 31.77%Submissions: 43K+Points: 4
Given an infinite number line. You start at 0 and can go either to the left or to the right. The condition is that in the ith move, you must take i steps. Given a destination d, find the minimum number of steps required to reach that destination.

Example 1:

Input: d = 2
Output: 3
Explaination: The steps taken are +1, -2 and +3.
Example 2:

Input: d = 10
Output: 4
Explaination: The steps taken are +1, +2, +3 and +4.
Your Task:
You do not need to read input or print anything. Your task is to complete the function minSteps() which takes the value d as input parameter and returns the minimum number of steps required to reach the destination d from 0.

Expected Time Complexity: O(sqrt(d))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ d ≤ 10000


 */
class Solution {
    static int minSteps(int d) {
        // code here
        return steps(0,0,d);
    }
    private static int steps(int step,int sum,int tar)
    {
        if(sum>=tar&&(sum-tar)%2==0)
        {
            return step;
        }
        return steps(step+1,sum+step+1,tar);
    }
}