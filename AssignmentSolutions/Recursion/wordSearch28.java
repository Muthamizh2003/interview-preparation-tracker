package Recursion;
/*
79. Word Search
Solved
Medium
Topics
Companies
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

Example 1:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
 

Constraints:

m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 

Follow up: Could you use search pruning to make your solution faster with a larger board?
 */
public class wordSearch28 {
    
}
//using tempword
class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        { 
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(backtrack(board,i,j,n,m,word,""))
                    {
                        return true;
                    }    
                }
            }
        }    
        return false;
    }
    private static boolean backtrack(char[][] board,int i,int j,int r,int c,String word,String nword)
    {
        if(word.equals(nword))
        {
            return true;
        }
        if(i<0||i>=r||j<0||j>=c||board[i][j]=='#'||nword.length()>word.length()||!word.startsWith(nword))
        {
            return false;
        }
        nword+=board[i][j];
        char temp=board[i][j];
        board[i][j]='#';
        boolean found=backtrack(board,i+1,j,r,c,word,nword)||backtrack(board,i,j+1,r,c,word,nword)||backtrack(board,i-1,j,r,c,word,nword)||backtrack(board,i,j-1,r,c,word,nword);
        board[i][j]=temp;
        return found;
    }
}
//using visited matrix 
class Solution2 {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[n][m];
                    if (dfs(board, i, j, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        boolean found = dfs(board, i + 1, j, word, index + 1, visited)
                     || dfs(board, i - 1, j, word, index + 1, visited)
                     || dfs(board, i, j + 1, word, index + 1, visited)
                     || dfs(board, i, j - 1, word, index + 1, visited);

        visited[i][j] = false;

        return found;
    }
}
