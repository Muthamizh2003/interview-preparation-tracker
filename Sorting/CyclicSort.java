package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args)
    {
        int[] arr={3,5,4,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    } 
    private static void sort(int[] arr) 
    {
        int i=0;
        while(i<arr.length)
        {
            int cor=arr[i]-1;
            if(arr[i]!=arr[cor])
            {
                swap(arr,i,cor);
            }
            else
            {
                i++;
            }
        }
    } 
    private static void swap(int[] arr,int i,int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
