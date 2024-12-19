package StriversSheet.Arrays.Hard;


/*
56. Merge Intervals
Solved
Medium
Topics
Companies
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104

 */
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        mergesort(intervals, 0, intervals.length - 1);
        int[] cur = intervals[0];
        res.add(cur);
        for (int i = 1; i < intervals.length; i++) {
            if (cur[1] >= intervals[i][0]) {
                cur[1] = Math.max(intervals[i][1], cur[1]);
            } else {
                cur = intervals[i];
                res.add(cur);
            }
        }
        int[][] result = new int[res.size()][2];
        int i = 0;
        for (int[] arr : res) {
            result[i++] = arr;
        }
        return result;
    }

    private static void mergesort(int[][] arr,int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        int mid=l+(r-l)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }

    public static void merge(int[][] arr, int l, int mid, int r) {
        int n = mid - l + 1;
        int m = r - mid;
        int[][] left = new int[n][2];
        int[][] right = new int[m][2];
        for (int i = 0; i < n; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < m; j++) {
            right[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n && j < m) {
            if (left[i][0] <= right[j][0]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n) {
            arr[k++] = left[i++];
        }
        while (j < m) {
            arr[k++] = right[j++];
        }
    }
}
