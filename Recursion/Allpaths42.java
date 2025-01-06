package Recursion;

import java.util.ArrayList;
import java.util.List;

/*
797. All Paths From Source to Target
Solved
Medium
Topics
Companies
Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.

The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).

 

Example 1:


Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
Example 2:


Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 

Constraints:

n == graph.length
2 <= n <= 15
0 <= graph[i][j] < n
graph[i][j] != i (i.e., there will be no self-loops).
All the elements of graph[i] are unique.
The input graph is guaranteed to be a DAG.
 */
public class Allpaths42 {
    
}
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths=new ArrayList<>();
        findall(graph,paths,0,graph.length-1,new ArrayList<>());
        return paths;
    }
    private static void findall(int[][] graph,List<List<Integer>> path,int start,int n,List<Integer> arr)
    {
        arr.add(start);
        if(start==n)
        {
            path.add(new ArrayList<>(arr));
            return;
        }
        else
        {    
            for(int i:graph[start])
            {
                findall(graph,path,i,n,arr);  
                arr.remove(arr.size()-1); 
            }
        }
    }
}