package Recursion;

import java.util.Scanner;

public class Product13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        System.out.println(product(n,v));
    }
    private static int product(int a,int b)
    {
        if(a<b)
        {
            return product(a, b);
        }
        else if(b>0)
        {
            return a+product(a, b-1);
        }
        else
            return 0;
    }
}
