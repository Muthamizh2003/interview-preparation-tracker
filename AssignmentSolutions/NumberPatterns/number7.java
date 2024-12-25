package AssignmentSolutions.NumberPatterns;

import java.util.Scanner;

/*
07.      4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4   
 */
public class number7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n;
        int top=0;
        int bot=2*n-2;
        int left=0;
        int right=2*n-2;
        int[][] res=new int[2*n-1][2*n-1];
        while(k>0)
        {
            for(int i=left;i<=right;i++)
            {
                res[top][i]=k;
            }   
            top++;
            for(int d=top;d<=bot;d++)
            {
                res[d][right]=k;
            }
            right--;
            for (int i=right;i>=left;i--)
            {
                res[bot][i]=k;
            }
            bot--;
            for(int i=bot;i>=top;i--)
            {
                res[i][left]=k;
            }
            left++;
            k--;
        }
        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[0].length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
