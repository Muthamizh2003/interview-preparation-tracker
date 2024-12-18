package NumberPatterns;

import java.util.Scanner;

/*
03.      1
        212
       32123
      4321234
       32123
        212
         1
 */
public class number3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }   
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }   
}
