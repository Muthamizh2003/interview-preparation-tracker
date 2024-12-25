package AssignmentSolutions.Patternsolutions;

import java.util.Scanner;

/*
04.  *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
 */
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++)
        {
            if(i<n)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*");
                }
            }
            if(i>=n)
            {
                for(int k=i;k<2*n-1;k++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }   
}
