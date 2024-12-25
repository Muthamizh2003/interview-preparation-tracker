package AssignmentSolutions.Patternsolutions;

import java.util.Scanner;


/*
17.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
 */
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j1=0;j1<=i;j1++)
            {
                System.out.print("*");
            }
            for(int k1=0;k1<2*(n-i-1);k1++)
            {
                System.out.print(" ");
            }
            for(int l1=0;l1<=i;l1++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*");
                }
                for(int k=0;k<2*(n-i-1);k++)
                {
                    System.out.print(" ");
                }
                for(int l=0;l<=i;l++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }    
}
