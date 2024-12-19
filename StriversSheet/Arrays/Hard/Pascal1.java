package StriversSheet.Arrays.Hard;
/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 */
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        generateall(numRows,arr);  
        return arr;   
    }
    private static void generateall(int n,List<List<Integer>> arr)
    {
        if(n==0)
        {
            return;
        }
        generateall(n-1,arr);
        List<Integer> cur=new ArrayList<>();
        cur.add(1);
        if(arr.size()>0)
        {
            List<Integer> prev=arr.get(arr.size()-1);
            for(int i=1;i<n-1;i++)
            {
                cur.add(prev.get(i)+prev.get(i-1));    
            }
        }
        if(n>1)
        cur.add(1);
        arr.add(cur);
    }
}