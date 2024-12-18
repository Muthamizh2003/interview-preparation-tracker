package Alphabetpatterns;

import java.util.Scanner;

/*
03.    a
       B c
       D e F
       g H i J
       k L m N o
 */
public class alpha3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='a';
        for(int i=0;i<=n;i++)
        {
            char c=ch;
            for(int j=0;j<i;j++)
            {
                if((int)(c)%2==0)
                {
                    System.out.print(Character.toUpperCase(c)+" ");
                }
                else
                {
                    System.out.print(c+" ");
                }
                c++;
            }
            ch=c;
            System.out.println();
        }     
    }
}
