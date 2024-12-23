package ArraySoln2D;
/*
Median in a row-wise sorted Matrix
Difficulty: HardAccuracy: 55.05%Submissions: 126K+Points: 8
Given a row-wise sorted matrix where the number of rows and columns is always odd, find the median of the matrix.

Examples:

Input: mat = [[1, 3, 5], [2, 6, 9], [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 
Input: mat = [[1], [2], [3]]
Output: 2
Explanation: Sorting matrix elements gives us {1,2,3}. Hence, 2 is median
Input: mat = [[3], [5], [8]]
Output: 5
Explanation: Sorting matrix elements gives us {3,5,8}. Hence, 5 is median.
Constraints:
1 <= mat.size(), mat[0].size() <= 400
1 <= mat[i][j] <= 2000


 */
public class MedianMatrix {
    
}

class Solution {
    int median(int mat[][]) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][n-1]);
        }
        int req=(n*m)/2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int small=smallelelessthanequalto(mat,m,n,mid);
            if(small<=req)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
    private static int smallelelessthanequalto(int[][] mat,int m,int n,int mid)
    {
        int c=0;
        for(int i=0;i<m;i++)
        {
            c+=upperbound(mat[i],mid,n);
        }
        return c;
    }
    private static int upperbound(int[] arr,int tar,int n)
    {
        int l=0;
        int r=n-1;
        int ans=n;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]>tar)
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