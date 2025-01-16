package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Cyclicsort7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int[] arr=new int[n];
        for(int k=0;k<arr.length;k++)
        {
            arr[k]=sc.nextInt();
        }
        sort(arr,0);
        System.out.println(Arrays.toString(arr));
    } 
    private static void sort(int[] arr,int i)
    {
            int cor=arr[i]-1;
            if(arr[i]!=arr[cor])
            {
                swap(arr,i,cor);
            }
            else
            {
                sort(arr,i+1);
            }
        
    }
    private static void swap(int[] arr,int i,int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }  
}
