package 2Darraysolutions;
//05. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)

class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++)
        {
            
            for(int j=0;j<mat.length;j++)
            {
            if(j==i||i+j==n-1)
                ans=ans+mat[i][j];
            
            }
           
            
        }
        return ans;
    }
}
