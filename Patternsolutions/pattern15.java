package Patternsolutions;

import java.util.Scanner;

/*


15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *      
 */
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            if(i>0)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            if(i>0)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
