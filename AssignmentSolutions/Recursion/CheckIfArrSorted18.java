package Recursion;
/*
Check if array is sorted
Difficulty: EasyAccuracy: 39.37%Submissions: 228K+Points: 2
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
Constraints:
1 ≤ arr.size ≤ 106
- 109 ≤ arr[i] ≤ 109


 */
public class CheckIfArrSorted18 {
    
}
class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        int n=arr.length;
        return issort(arr,n);
    }
    private static boolean issort(int[] arr,int n)
    {
        if(n==1||n==0)
        {
            return true;
        }
        return arr[n-1]>=arr[n-2]&&(issort(arr,n-1));
    }
}
