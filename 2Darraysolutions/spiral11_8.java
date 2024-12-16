package 2Darraysolutions;

//08. [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int val = 1;
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) { arr[t][i] = val; val++; }
            t++;
            for (int i = t; i <= b; i++) { arr[i][r] = val; val++; }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--) { arr[b][i] = val; val++; }
            }
            b--;
            if (l <= r) {
                for (int i = b; i >= t; i--) { arr[i][l] = val; val++; }
            }
            l++;
        }
        return arr;
    }
}
