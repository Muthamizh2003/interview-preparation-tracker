package Recursion;

import java.util.Scanner;

public class Nto12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

       printn(n);

    }
    private static void printn(int n)
    {
         
        System.out.println(n);
        if(n==1)
        {
            return;
        }
        printn(--n);
    }   
}
