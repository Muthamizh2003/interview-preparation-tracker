package AssignmentSolutions.NumberPatterns;

import java.util.Scanner;

/*
02. 1 1 1 1 1 1
    2 2 2 2 2
    3 3 3 3
    4 4 4
    5 5
    6
 */
public class number2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    
        for(int i=1;i<=n;i++)
        {
            for(int i1=0;i1<=n-i;i1++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
