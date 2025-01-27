package Recursion;

import java.util.ArrayList;
import java.util.List;

/*
51. N-Queens
Solved
Hard
Topics
Companies
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 

Constraints:

1 <= n <= 9

 */
public class NQueens57 {
    
}
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            board.add(new String(new char[n]).replace('\0','.'));    
        }
        backtrack(res,board,n,0);
        return res;    
    }
    private void backtrack(List<List<String>> res,List<String> board,int n,int r)
    {
        if(r==n)
        {
            res.add(new ArrayList<>(board));
        }
        for(int c=0;c<n;c++)
        {
            if(isvalid(board,r,c,n))
            {
            StringBuilder row=new StringBuilder(board.get(r));
            row.setCharAt(c,'Q');
            board.set(r,row.toString());
            backtrack(res,board,n,r+1);
            row.setCharAt(c,'.');
            board.set(r,row.toString());
            }
        }
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

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }  
        Set<Integer> col=new HashSet<>();
        Set<Integer> diagl=new HashSet<>();
        Set<Integer> diagr=new HashSet<>();
        backtrack(board,0,n,res,col,diagl,diagr);
        return res; 
    }
    private static void backtrack(char[][] board,int r,int n,List<List<String>> res,Set<Integer> col,Set<Integer> dl,Set<Integer> dr)
    {
        if(r==n)
        {
            res.add(construct(board));
            return;
        }
        else
        {
            for(int c=0;c<n;c++)
            {
                if(col.contains(c)||dl.contains(r-c)||dr.contains(r+c))
                {
                    continue;
                }
                board[r][c]='Q';
                col.add(c);
                dl.add(r-c);
                dr.add(r+c);
                backtrack(board,r+1,n,res,col,dl,dr);
                board[r][c]='.';
                col.remove(c);
                dl.remove(r-c);
                dr.remove(r+c);
            }
        }
    }
    private static List<String> construct(char[][] board)
    {
        List<String> b=new ArrayList<>();
        for(char[] bb:board)
        {
            b.add(new String(bb));
        }
        return b;
    }
}