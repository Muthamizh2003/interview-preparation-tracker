package Patternsolutions;

import java.util.Scanner;

/*
05.       *
         **
        ***
       ****
      *****
 */
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k;
            for(k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>k;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
