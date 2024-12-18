package Alphabetpatterns;

import java.util.Scanner;

/*
01.    E
       D E
       C D E
       B C D E
       A B C D E
 */
public class alpha1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for (char ch=(char)('A'+n-1-i);ch<='A'+n-1;ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }    
}   
