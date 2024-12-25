package AssignmentSolutions.NumberPatterns;

import java.util.Scanner;

/*
08.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

 */
public class number8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        int v=1;
        int newrv=n*(n+1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<n-i;k++)
            {
                System.out.print(v++ +" ");
            }
            int l;
            for(l=newrv-n+1;l<=newrv-i;l++)
            {
                System.out.print(l +" ");
            }
            newrv=newrv-n+1+i;
            System.out.println();
        }
    }   
}
