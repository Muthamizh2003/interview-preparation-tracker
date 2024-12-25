/*
Infinite Array - Find the Target in an Infinite Array Using Binary Search. Description: You are given an infinite sorted array, 
and you need to find the index of a given target using binary search. Since the array is infinite, you cannot determine its
 size or directly access out-of-bound indices.
 */

import java.util.Scanner;

public class Infinity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int i=find(arr,tar);
        System.out.println("Found at"+" "+i+1);
    }
    private static int find(int[] arr,int tar)
    {
        int l=0;
        int r=1;
        while(r<arr.length&&arr[r]<tar)
        {
            l=r;
            r*=2;
        }   
        r=Math.min(r,arr.length-1);
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(tar==arr[mid])
            {
                return mid;
            }
            else if(arr[mid]<tar)
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
