package Recursion;
/*
526. Beautiful Arrangement
Solved
Medium
Topics
Companies
Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a beautiful arrangement if for every i (1 <= i <= n), either of the following is true:

perm[i] is divisible by i.
i is divisible by perm[i].
Given an integer n, return the number of the beautiful arrangements that you can construct.

 

Example 1:

Input: n = 2
Output: 2
Explanation: 
The first beautiful arrangement is [1,2]:
    - perm[1] = 1 is divisible by i = 1
    - perm[2] = 2 is divisible by i = 2
The second beautiful arrangement is [2,1]:
    - perm[1] = 2 is divisible by i = 1
    - i = 2 is divisible by perm[2] = 1
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 15
 */
public class BeautifulArrangement44 {
    
}
class Solution {
    public int countArrangement(int n) {
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i+1;     
        }
        return count(n,0,arr);    
    }
    private static int count(int n,int start,int[] arr)
    {
        int c=0;
        if(start==arr.length)
        {
            return 1;
        }
        for(int i=start;i<arr.length;i++)
        {
            swap(start,i,arr);
            if((start+1)%arr[start]==0||arr[start]%(start+1)==0)
            {
                c+=count(n,start+1,arr);   
            }
            swap(start,i,arr); 
        }
        return c;
    }
    private static void swap(int i,int j,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}