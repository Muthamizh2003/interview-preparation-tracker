package Patternsolutions;

import java.util.Scanner;

/*
13.      *
        * *
       *   *
      *     *
     *********
 */
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            if(i==n-1)
            {
                for(int j=0;j<2*n-1;j++)
                {
                    System.out.print("*");
                }
            } 
            else
            {
                System.out.print("*");
                for(int k=0;k<2*i-1;k++)
                {
                    System.out.print(" ");
                }
                if(i>0)System.out.print("*");
            }
            System.out.println();
        }
    }
}
