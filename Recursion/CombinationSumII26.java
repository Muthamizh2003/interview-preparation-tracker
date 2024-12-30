package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
40. Combination Sum II
Solved
Medium
Topics
Companies
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30
 */
public class CombinationSumII26 {
    
}
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        int n=candidates.length;
        backtrack(res,new ArrayList<>(),candidates,0,n,target);
        return res;
    }
    private static void backtrack(List<List<Integer>> res,List<Integer> arr,int[] cad,int start,int n,int target)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=start;i<n;i++)
        {
            if(i>start&&cad[i]==cad[i-1])continue;
            if(cad[i]>target)break;
            arr.add(cad[i]);
            backtrack(res,arr,cad,i+1,n,target-cad[i]);
            arr.remove(arr.size()-1);
        }
    }
}