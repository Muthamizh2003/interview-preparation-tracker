package 2Darraysolutions;

//09. [Spiral Matrix III](https://leetcode.com/problems/spiral-matrix-iii/)

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int numSteps=1,totalCells=rows*cols,d=0,index=0;
        int[][] result = new int[totalCells][2];
        int r = rStart, c = cStart;
        result[index++] = new int[]{r, c};
        while (index < totalCells) {
            for (int i=0;i<2;i++) {
                for (int j=0;j<numSteps;j++) {
                    r+=directions[d][0];
                    c+=directions[d][1];
                    if(0<=r&&r<rows&&0<=c&&c<cols) {
                        result[index++]=new int[]{r,c};
                    }
                    if(index==totalCells)return result;
                }
                d=(d+1)%4;
            }
            numSteps++;
        }
        return result;
    }
}
