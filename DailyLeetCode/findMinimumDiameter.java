package DailyLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
3203. Find Minimum Diameter After Merging Two Trees
Solved
Hard
Topics
Companies
Hint
There exist two undirected trees with n and m nodes, numbered from 0 to n - 1 and from 0 to m - 1, respectively. You are given two 2D integer arrays edges1 and edges2 of lengths n - 1 and m - 1, respectively, where edges1[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the first tree and edges2[i] = [ui, vi] indicates that there is an edge between nodes ui and vi in the second tree.

You must connect one node from the first tree with another node from the second tree with an edge.

Return the minimum possible diameter of the resulting tree.

The diameter of a tree is the length of the longest path between any two nodes in the tree.

 

Example 1:

Input: edges1 = [[0,1],[0,2],[0,3]], edges2 = [[0,1]]

Output: 3

Explanation:

We can obtain a tree of diameter 3 by connecting node 0 from the first tree with any node from the second tree.

Example 2:


Input: edges1 = [[0,1],[0,2],[0,3],[2,4],[2,5],[3,6],[2,7]], edges2 = [[0,1],[0,2],[0,3],[2,4],[2,5],[3,6],[2,7]]

Output: 5

Explanation:

We can obtain a tree of diameter 5 by connecting node 0 from the first tree with node 0 from the second tree.

 

Constraints:

1 <= n, m <= 105
edges1.length == n - 1
edges2.length == m - 1
edges1[i].length == edges2[i].length == 2
edges1[i] = [ai, bi]
0 <= ai, bi < n
edges2[i] = [ui, vi]
0 <= ui, vi < m
The input is generated such that edges1 and edges2 represent valid trees.

 */
public class findMinimumDiameter {
    
}
class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int n=edges1.length+1;
        int m=edges2.length+1;
        List<List<Integer>> adj1=new ArrayList<>();
        List<List<Integer>> adj2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj1.add(new ArrayList<>());
        }   
        for(int i=0;i<m;i++)
        {
            adj2.add(new ArrayList<>());
        }
        for(int[] edge:edges1)
        {
            adj1.get(edge[0]).add(edge[1]);
            adj1.get(edge[1]).add(edge[0]);
        }
        for(int[] edge:edges2)
        {
            adj2.get(edge[0]).add(edge[1]);
            adj2.get(edge[1]).add(edge[0]);
        }
        int[] p1=new int[]{-1,Integer.MIN_VALUE};
        boolean[] vis=new boolean[n];
        get(p1,adj1,0,0,vis);//1st pt find
        int[] p2=new int[]{-1,Integer.MIN_VALUE};
        Arrays.fill(vis,false);
        get(p2,adj1,p1[0],0,vis);//ist pt to our next last pt
        int d1=p2[1];
        p1=new int[]{-1,Integer.MIN_VALUE};
        vis=new boolean[m];
        get(p1,adj2,0,0,vis);//same in T2
        p2=new int[]{-1,Integer.MIN_VALUE};
        Arrays.fill(vis,false);
        get(p2,adj2,p1[0],0,vis);//same in T2
        int d2=p2[1];
        if(edges1.length==0)
            d1=0;
        if(edges2.length==0)
            d2=0;
        return Math.max(Math.max(d1,d2),(d1+1)/2+(d2+1)/2+1);//the diameter is 3 for my example 
    }
    private void get(int[] p,List<List<Integer>> adj,int node,int dis,boolean[] vis)
    {
        int d=p[1];
        vis[node]=true;
        if(dis>d)
        {
            p[0]=node;
            p[1]=dis;
        }
        for(int neighbor:adj.get(node))
        {
            if(!vis[neighbor])
            {
                get(p,adj,neighbor,dis+1,vis);
            }
        }
    }
}