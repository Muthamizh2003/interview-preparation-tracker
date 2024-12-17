package Patternsolutions;

import java.util.Scanner;

/*
12.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
 */
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");    
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }    
}
