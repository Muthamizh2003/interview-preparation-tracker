package ArraySoln2D;
/*
Row with max 1s
Difficulty: MediumAccuracy: 33.09%Submissions: 324K+Points: 4
You are given a 2D binary array arr[][] consisting of only 1s and 0s. Each row of the array is sorted in non-decreasing order. Your task is to find and return the index of the first row that contains the maximum number of 1s. If no such row exists, return -1.

Note:

The array follows 0-based indexing.
The number of rows and columns in the array are denoted by n and m respectively.
Examples:

Input: arr[][] = [[0,1,1,1], [0,0,1,1], [1,1,1,1], [0,0,0,0]]
Output: 2
Explanation: Row 2 contains the most number of 1s (4 1s). Hence, the output is 2.
Input: arr[][] = [[0,0], [1,1]]
Output: 1
Explanation: Row 1 contains the most number of 1s (2 1s). Hence, the output is 1.
Input: arr[][] = [[0,0], [0,0]]
Output: -1
Explanation: No row contains any 1s, so the output is -1.
Constraints:
1 ≤ arr.size(), arr[i].size() ≤ 103
0 ≤ arr[i][j] ≤ 1 
 */
public class RowWithMax1s {
    
}
// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            int index=findlower(arr,i);
            if(index!=-1&&index<min)
            {
                min=index;
                ans=i;
            }
        }
        return ans;
    }
    private static int findlower(int[][] arr,int i)
    {
        int l=0;
        int r=arr[0].length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[i][mid]==1)
            {
                ans=mid;
                r=mid-1;    
            }
            else
            {
               l=mid+1;        
            }
        }
        return ans;
    }
}