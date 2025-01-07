package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RateInMaze48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] maze = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 1, 1, 0, 0 },
                         { 0, 1, 1, 1 } };
        List<String> res=new ArrayList<>();
        boolean[][] visited=new boolean[maze.length][maze[0].length];
        allpath(maze,0,0,maze.length,maze[0].length,"",res,visited);
        System.out.println(res);

    }
    private static void allpath(int[][] maze, int i, int j, int n, int m, String str,List<String> res,boolean[][] visited) 
    {
        if(i<0||i>=n||j<0||j>=m)
        {
            return;
        }   
        else if(visited[i][j]||maze[i][j]==0)
        {
            return;
        }
        else if(i==n-1&&j==m-1)
        {
            res.add(str);
            return;
        }
        else
        {
            visited[i][j]=true;
            allpath(maze, i-1, j, n, m, str+"U", res, visited);
            allpath(maze, i+1, j, n, m, str+"D", res, visited);
            allpath(maze, i, j+1, n, m, str+"R", res, visited);
            allpath(maze, i, j-1, n, m, str+"L", res, visited);
            visited[i][j]=false;
        }
    }        
}
