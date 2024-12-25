package AssignmentSolutions.Patternsolutions;

import java.util.Scanner;

/*
20.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *
 */
public class pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.print("*");
        for (int i=0;i<2*n-2;i++) System.out.print(" ");
        System.out.print("*");
        System.out.println();
        for (int i=1;i<n;i++) {
            System.out.print("*");
            for (int j=0;j<i-1;j++)
                 System.out.print(" ");
            System.out.print("*");
            for (int j=0;j<2*(n-i-1);j++)
                System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < i-1; j++) 
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
        for (int i=n-2;i>=0;i--) {
            System.out.print("*");
            for (int j=0;j<i;j++) 
                System.out.print(" ");
            System.out.print("*");
            for (int j=0;j<2*(n-i-1)-2;j++)
                 System.out.print(" ");
            System.out.print("*");
            for (int j=0;j<i;j++)
                 System.out.print(" ");
            System.out.print("*");
            System.out.println();
        } 
        System.out.print("*");
        for(int i=0;i<2*n-2;i++) 
            System.out.print(" ");
        System.out.print("*");
    }
}
