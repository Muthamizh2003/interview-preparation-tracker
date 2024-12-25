package AssignmentSolutions.Patternsolutions;

import java.util.Scanner;

/*
22.        *      *
         *   *  *   *
       *      *      *
 */
public class pattern22 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        for(int i=0;i<2*n-3;i++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
    System.out.println();
    for(int i=1;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        for(int k=0;k<2*i-1;k++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        for(int l=0;l<2*(n-i-1)-1;l++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        for(int j=0;j<2*i-1;j++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        
        System.out.println();   
    }
    System.out.print("*");
    for(int i=0;i<2*n-3;i++)
    {
        System.out.print(" ");
    }
    System.out.print("*");
    for(int i=0;i<2*n-3;i++)
    {
        System.out.print(" ");
    }
    System.out.print("*");
    }   
}
