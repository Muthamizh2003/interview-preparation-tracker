package AssignmentSolutions.Patternsolutions;

import java.util.Scanner;

/*
10.  * * * * *
      * * * *
       * * *
        * *
         *
 */
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--)
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
