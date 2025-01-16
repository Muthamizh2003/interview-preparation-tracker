/*
980. Unique Paths III
Solved
Hard
Topics
Companies
You are given an m x n integer array grid where grid[i][j] could be:

1 representing the starting square. There is exactly one starting square.
2 representing the ending square. There is exactly one ending square.
0 representing empty squares we can walk over.
-1 representing obstacles that we cannot walk over.
Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.

 

Example 1:


Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
Output: 2
Explanation: We have the following two paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
Example 2:


Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,0,2]]
Output: 4
Explanation: We have the following four paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
Example 3:


Input: grid = [[0,1],[2,0]]
Output: 0
Explanation: There is no path that walks over every empty square exactly once.
Note that the starting and ending square can be anywhere in the grid.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 20
1 <= m * n <= 20
-1 <= grid[i][j] <= 2
There is exactly one starting cell and one ending cell.
 */
public class UniquePAthsIII60 {
    
}
class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=-1;
            }
        }
        int flagr=-1;
        int flagc=-1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    flagr=i;
                    flagc=j;
                    break;
                }
            }
        }
        int robor=-1;
        int roboc=-1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    robor=i;
                    roboc=j;
                    break;
                }
            }
        }
        int empty=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0||grid[i][j]==1)
                {
                    empty++;
                }
            }
        }
        return paths(flagr,flagc,robor,roboc,m,n,grid,dp,empty,0);
    }
    private static int paths(int fr,int fc,int sr,int sc,int m,int n,int[][] grid,int[][] dp,int e,int vis)
    {
        if(fr==sr&&fc==sc)
        {
            return vis==e?1:0;
        }
        if(sr<0||sc<0||sr>=m||sc>=n||grid[sr][sc]==-1)
        {
            return 0;
        }
        if(dp[sr][sc]!=-1)
        {
            return dp[sr][sc];
        }
        grid[sr][sc]=-1;
        vis++;
        int tot=paths(fr,fc,sr-1,sc,m,n,grid,dp,e,vis)+paths(fr,fc,sr,sc-1,m,n,grid,dp,e,vis)+
        paths(fr,fc,sr+1,sc,m,n,grid,dp,e,vis)+paths(fr,fc,sr,sc+1,m,n,grid,dp,e,vis);
        grid[sr][sc]=0;
        vis--;
        return tot;
    }
}