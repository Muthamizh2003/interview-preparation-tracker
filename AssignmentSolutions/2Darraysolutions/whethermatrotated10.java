package 2Darraysolutions;

//10. [Determine Whether Matrix Can Be Obtained By Rotation]
//(https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++)
        {
            if(check(mat,target))
            {
                return true;    
            }
            rotate(mat);
        }     
        return false; 
    }
    private boolean check(int[][] mat,int[][] target)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    } 
    private void rotate(int[][] matrix)
    {
        int top = 0;
        int bottom = matrix.length - 1;
        int n=matrix.length;
        while (top < bottom) {
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}