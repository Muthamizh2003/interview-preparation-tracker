package Recursion;

import java.util.Scanner;

public class firstN1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

       printn(n,1);

    }
    private static void printn(int n,int i)
    {
         
        System.out.println(i);
        if(n==i)
        {
            return;
        }
        printn(n,++i);
    }
}
