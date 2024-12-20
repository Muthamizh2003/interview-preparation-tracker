package StriversSheet.Arrays.Hard;

import java.util.ArrayList;

/*
Count Inversions
Difficulty: MediumAccuracy: 16.93%Submissions: 605K+Points: 4
Given an array of integers arr[]. Find the Inversion Count in the array.
Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104
 */

public class InversionCount {
    
}
// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    public static int merge(int arr[],int low,int mid,int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        
        int cnt = 0;
        while(left<= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
                cnt += (mid -left +1);
            }
        }
        // if left over
        while( left <= mid){
            temp.add(arr[left++]);
        }
        while(right <= high){
            temp.add(arr[right++]);
        } 
        for(int i =low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        return cnt;
    }
    public static int mergeSort(int arr[],int low, int high){
        int cnt =0;
        if(low >=high) return cnt;
        int mid = (low+high)/2;
        cnt += mergeSort(arr,low,mid);        //left half
        cnt += mergeSort(arr,mid+1,high);        //right half
        cnt += merge(arr,low,mid,high);        //left half
       
        return cnt;
    }
    static int inversionCount(int arr[]) {
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }
}