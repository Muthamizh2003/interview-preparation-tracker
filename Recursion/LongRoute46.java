package Recursion;
/*
Longest Possible Route in a Matrix with Hurdles
Difficulty: MediumAccuracy: 50.0%Submissions: 14K+Points: 4
Given an N x M matrix, with a few hurdles(denoted by 0) arbitrarily placed, calculate the length of the longest possible route possible from source(xs,ys) to a destination(xd,yd) within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contain any diagonal moves and a location once visited in a particular path cannot be visited again.If it is impossible to reach the destination from the source return -1.

 

Example 1:

Input:
{xs,ys} = {0,0}
{xd,yd} = {1,7}
matrix = 1 1 1 1 1 1 1 1 1 1
         1 1 0 1 1 0 1 1 0 1
         1 1 1 1 1 1 1 1 1 1
Output: 24
Explanation:

 

Example 2:

Input: 
{xs,ys} = {0,3}
{xd,yd} = {2,2}
matrix = 1 0 0 1 0
         0 0 0 1 0
         0 1 1 0 0
Output: -1
Explanation:
We can see that it is impossible to
reach the cell (2,2) from (0,3).
Your Task:
You don't need to read input or print anything. Your task is to complete the function longestPath() which takes matrix ,source and destination as input parameters and returns an integer denoting the longest path.


Expected Time Complexity: O(2^(N*M))
Expected Auxiliary Space: O(N*M)


Constraints:
1 <= N,M <= 10


 */
public class LongRoute46 {
    
}

class Solution {
    public static int longestPath(int[][] mat, int n, int m, int xs, int ys, int xd, int yd) {
        if (mat[xs][ys] == 0 || mat[xd][yd] == 0) {
            return -1;
        }
        boolean[][] visited = new boolean[n][m];
        return bigpath(mat, n, m, xs, ys, xd, yd, 0, visited);
    }

    private static int bigpath(int[][] mat, int n, int m, int i, int j, int dx, int dy, int cur, boolean[][] visited) {
        if (i == dx && j == dy) {
            return cur;
        }
        if (i < 0 || i >= n || j < 0 || j >= m || mat[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int up = bigpath(mat, n, m, i - 1, j, dx, dy, cur + 1, visited);
        int down = bigpath(mat, n, m, i + 1, j, dx, dy, cur + 1, visited);
        int left = bigpath(mat, n, m, i, j - 1, dx, dy, cur + 1, visited);
        int right = bigpath(mat, n, m, i, j + 1, dx, dy, cur + 1, visited);
        visited[i][j] = false;
        return Math.max(Math.max(up, down), Math.max(left, right));
    }
}
