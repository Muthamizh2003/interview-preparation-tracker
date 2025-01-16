package Recursion;
/*
1219. Path with Maximum Gold
Solved
Medium
Topics
Companies
Hint
In a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.

Return the maximum amount of gold you can collect under the conditions:

Every time you are located in a cell you will collect all the gold in that cell.
From your position, you can walk one step to the left, right, up, or down.
You can't visit the same cell more than once.
Never visit a cell with 0 gold.
You can start and stop collecting gold from any position in the grid that has some gold.
 

Example 1:

Input: grid = [[0,6,0],[5,8,7],[0,9,0]]
Output: 24
Explanation:
[[0,6,0],
 [5,8,7],
 [0,9,0]]
Path to get the maximum gold, 9 -> 8 -> 7.
Example 2:

Input: grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
Output: 28
Explanation:
[[1,0,7],
 [2,0,6],
 [3,4,5],
 [0,3,0],
 [9,0,20]]
Path to get the maximum gold, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 15
0 <= grid[i][j] <= 100
There are at most 25 cells containing gold.
 */
public class PathWithGold45 {
    
}
class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] > 0) {
                    max = Math.max(max, findcoins(grid, n, m, i, j, visited));
                }
            }
        }
        return max;
    }

    private static int findcoins(int[][] grid, int n, int m, int i, int j, boolean[][] visited) {
        int coins = 0;
        if (i >= 0 && i < n && j >= 0 && j < m && grid[i][j] != 0 && !visited[i][j]) {
            coins += grid[i][j];
            visited[i][j] = true;
            int d = findcoins(grid, n, m, i + 1, j, visited);
            int r = findcoins(grid, n, m, i, j + 1, visited);
            int u = findcoins(grid, n, m, i - 1, j, visited);
            int l = findcoins(grid, n, m, i, j - 1, visited);
            coins += Math.max(Math.max(u, d), Math.max(l, r));
            visited[i][j] = false;
        }
        return coins;
    }
}