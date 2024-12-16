package 2Darraysolutions;
//11. [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newmat=new int[r][c];
        if (mat.length*mat[0].length!=r*c) {
            return mat; 
        }
        int rw=0;
        int cl=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                newmat[rw][cl++]=mat[i][j];
                if(cl==c)
                {
                    cl=0;
                    rw++;
                }     
            }
        }    
        return newmat;
    }
}