/*

Code
Testcase
Testcase
Test Result
1539. Kth Missing Positive Number
Solved
Easy
Topics
Companies
Hint
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

 

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 

Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 */

 class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int r=arr.length-1;
        //[2,3,4,7,11]
        //=>missing=>[1,1,1,3,6]
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int missingno=arr[mid]-mid-1;
            if(missingno<k)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }   
        return r+k+1;//arr[h]+more=>arr[h]+k-arr[h]+h+1=>k+h+1
    }
}