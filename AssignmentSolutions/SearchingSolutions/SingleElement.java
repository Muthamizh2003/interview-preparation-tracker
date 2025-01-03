/*
540. Single Element in a Sorted Array
Solved
Medium
Topics
Companies
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
 */
public class SingleElement {
    
}
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(n==1)
            return arr[0];
        if(arr[0]!=arr[1])
        {
            return arr[0];
        }    
        if(arr[n-1]!=arr[n-2])
        {
            return arr[n-1];
        }
        int l=1;
        int r=arr.length-2;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            //find-> the left half and righr half based on (even,odd)->left and(odd,even)->right
            if(arr[mid]!=arr[mid+1]&&arr[mid]!=arr[mid-1])
            {
                return arr[mid];
            }
            if((arr[mid]==arr[mid-1]&&mid%2==1)||(arr[mid+1]==arr[mid]&&mid%2==0))
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;
    }
}