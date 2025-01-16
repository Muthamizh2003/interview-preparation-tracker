package Recursion;
/*
200. Number of Islands
Solved
Medium
Topics
Companies
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
 */
public class NumberOfIslands71 {
    
}
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int no=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,m,n,i,j);
                    no++;
                }
            }
        }
        return no;
    }
    private static void dfs(char[][] grid,int r,int c,int cr,int cc)
    {
        if(!(cr>=0&&cr<r)||!(cc>=0&&cc<c)||(grid[cr][cc]=='0'))
        {
            return;
        }
        grid[cr][cc]='0';
        dfs(grid,r,c,cr+1,cc);
        dfs(grid,r,c,cr,cc+1);
        dfs(grid,r,c,cr-1,cc);
        dfs(grid,r,c,cr,cc-1);
    }
}