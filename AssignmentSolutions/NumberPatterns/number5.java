package AssignmentSolutions.NumberPatterns;

import java.util.Scanner;

/*
05.    1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
 */
public class number5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int k=i%2;
            for(int j=0;j<i;j++)
            {
                System.out.print(k+" ");
            k=(k==1)?0:1;
            }
            System.out.println();
        }
    }   
}
