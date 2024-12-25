package AssignmentSolutions.Patternsolutions;

/*
14.  *********
      *     *
       *   *
        * *
         *

 */
import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--)
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
