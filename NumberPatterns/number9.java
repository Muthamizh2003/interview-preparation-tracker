package NumberPatterns;

import java.util.Scanner;

/*
09.    1      1
       12    21
       123  321
       12344321

 */
public class number9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j);
            }
            for(int k=0;k<2*n-2*i-2;k++)
            {
                System.out.print(" ");
            }
            for(int l=i+1;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }

    }    
}
