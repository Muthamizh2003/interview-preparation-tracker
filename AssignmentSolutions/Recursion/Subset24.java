package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Subsequence question Eg. Input [1, 2, 3]. Output: [1, 2, 3, 12, 13, 23, 123, []]
public class Subset24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n]; 
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        List<List<Integer>> res=new ArrayList<>();  
        subset(nums,0,nums.length,res,new ArrayList<>()); 
        System.out.println(res);
    }
    private static void subset(int[] nums,int start,int n,List<List<Integer>> res,List<Integer> arr)
    {
        if(start==n)
        {
            res.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[start]);
        subset(nums, start+1, n, res, arr);
        arr.remove(arr.size()-1);
        subset(nums, start+1, n, res, arr);
    }
}
