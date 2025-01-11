/*
 * 
 */
public class LandMines61 {
    
}
class Solution1dfs {
    private static int min;
    public int findShortestPath(int[][] mat) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    change(mat,i,j);
                }
            }
        }
        min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            if(mat[i][0]==1)
            {
                boolean[][] visited=new boolean[m][n];
                backtrack(mat,i,0,0,visited,m,n);
            }
        }
        return min==Integer.MAX_VALUE?-1:min+1;
    }
    private static void change(int[][] mat,int r,int c)
    {
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<4;i++)
        {
            int row=r+dir[i][0];
            int col=c+dir[i][1];
            if(row>=0&&row<mat.length&&col>=0&&col<mat[0].length&&mat[row][col]==1)
            {
                mat[row][col]=-1;
            }
        }
    }
    private static void backtrack(int[][] mat,int r,int c,int steps,boolean[][] vis,int m,int n)
    {
        if(c==n-1)
        {
            min=Math.min(min,steps);
            return;
        }
        if(r<0||r>=mat.length||c<0||c>=mat[0].length||mat[r][c]<=0||vis[r][c])
        {
            return;
        }
        if(steps>=min)
        {
            return;
        }
        if(r>=0&&r<m&&c>=0&&c<n&&mat[r][c]!=0&&!vis[r][c])
        {
            steps++;
            vis[r][c]=true;
            backtrack(mat,r-1,c,steps,vis,m,n);
            backtrack(mat,r,c-1,steps,vis,m,n);
            backtrack(mat,r+1,c,steps,vis,m,n);
            backtrack(mat,r,c+1,steps,vis,m,n);
            vis[r][c]=false;
        }
    }
}
class Solution1bfs {
    public int findShortestPath(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    markUnsafeCells(mat, i, j);
                }
            }
        }
        int minPath = bfs(mat, m, n);

        return minPath == Integer.MAX_VALUE ? -1 : minPath;
    }

    private void markUnsafeCells(int[][] mat, int r, int c) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (nr >= 0 && nr < mat.length && nc >= 0 && nc < mat[0].length && mat[nr][nc] == 1) {
                mat[nr][nc] = -1;
            }
        }
    }

    private int bfs(int[][] mat, int m, int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            if (mat[i][0] == 1) {
                queue.offer(new int[]{i, 0, 1}); 
                visited[i][0] = true;
            }
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int steps = current[2];
            if (c == n - 1) {
                return steps;
            }
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && mat[nr][nc] == 1 && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, steps + 1});
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}
