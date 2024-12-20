/*
Spirally traversing a matrix
Difficulty: MediumAccuracy: 35.2%Submissions: 295K+Points: 4
You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

Examples:

Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Explanation: 

Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
Explanation: Applying same technique as shown above.
Input: mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]
Output: [32, 44, 27, 23, 62, 50, 28, 54]
Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].
Constraints:
1 <= n, m <= 1000
0 <= mat[i][j]<= 100


 */

import java.util.ArrayList;

public class SpiralMatrix {
    
}
class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        int top=0;
        int bot=mat.length-1;
        int left=0;
        int right=mat[0].length-1;
        while(top<=bot&&left<=right)
        {
            for(int i=left;i<=right;i++){
                arr.add(mat[top][i]);
            }
            top++;
            for(int j=top;j<=bot;j++)
            {
                arr.add(mat[j][right]);
            }
            right--;
            if(top<=bot)
            {
                for(int i=right;i>=left;i--)
                {
                    arr.add(mat[bot][i]);   
                }
            }
            bot--;
            if(left<=right)
            {
                for(int k=bot;k>=top;k--)
                {
                    arr.add(mat[k][left]);
                }
            }
            left++;
        }
        return arr;
    }
}
