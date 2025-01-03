package Recursion;

import java.util.ArrayList;
import java.util.List;

/*
52. N-Queens II
Solved
Hard
Topics
Companies
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

 

Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 9
 */
public class NQueensII58 {
    
}
class Solution {
    public int totalNQueens(int n) {
        List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            board.add(new String(new char[n]).replace('\0','.'));    
        }
        return backtrack(board,n,0);   
    }
    private int backtrack(List<String> board,int n,int r)
    {
        int res=0;
        if(r==n)
        {
            return 1;
        }
        for(int c=0;c<n;c++)
        {
            if(isvalid(board,r,c,n))
            {
            StringBuilder row=new StringBuilder(board.get(r));
            row.setCharAt(c,'Q');
            board.set(r,row.toString());
            res+=backtrack(board,n,r+1);
            row.setCharAt(c,'.');
            board.set(r,row.toString());
            }
        }
        return res;
    }
    private boolean isvalid(List<String> board,int r,int c,int n)
    {
        for(int i=0;i<r;i++)
        {
            if(board.get(i).charAt(c)=='Q')
            {
                return false;
            }
        }
        for(int j=0;j<r;j++)
        {
            int dl=c-(r-j);
            int dr=c+(r-j);
            if((dl>=0)&&(board.get(j).charAt(dl)=='Q')||
            (dr<n)&&(board.get(j).charAt(dr)=='Q'))
            {
                return false;
            }
        }
        return true;
    }
}
