package Patternsolutions;

import java.util.Scanner;

/*
09.      *
        * *
       * * *
      * * * *
     * * * * *
 */
public class pattern9 {
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
    }
}
