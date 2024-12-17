package Patternsolutions;

import java.util.Scanner;

/*
18.    ****
       *  *
       *  *
       *  *
       ****
 */
public class pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {   if(i==0||i==n-1)
            for(int j=0;j<n-1;j++)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("*");
                for(int j=0;j<n-3;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();     
        }
    }    
}
