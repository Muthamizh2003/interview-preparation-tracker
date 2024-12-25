package AssignmentSolutions.Patternsolutions;

import java.util.Scanner;

/*
19.        ****
          *  *
         *  *
        *  *
       ****
 */
public class pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int i1=0;i1<n-i;i1++)
            {
                System.out.print(" ");
            }
            if(i==0||i==n-1)
            {
                for(int j=0;j<n-1;j++)
                {
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int k=0;k<n-3;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            for(int i2=0;i2<i;i2++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
