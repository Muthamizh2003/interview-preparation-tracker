package Recursion;
import java.util.Arrays;
/* 
Sum triangle from array
Last Updated : 16 Nov, 2022
Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level. 
Example :
 

Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5] 

Explanation :
Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
*/
import java.util.Scanner;

public class SumOfTriagle8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        triangle(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void triangle(int[] arr)
    {
        if(arr.length<=1)
        {
            return;
        }
        int[] temp=new int[arr.length-1];
        wanttocreate(temp,arr,0);
        triangle(temp);
        System.out.println(Arrays.toString(temp));
    }
    private static void wanttocreate(int[] temp,int[] arr,int id)
    {
        if(id>=arr.length-1)
        {
            return;
        }
        temp[id]=arr[id]+arr[id+1];
        wanttocreate(temp, arr, id+1);
    }
}
