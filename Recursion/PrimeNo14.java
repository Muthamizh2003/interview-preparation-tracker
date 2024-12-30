package Recursion;

import java.util.Scanner;

public class PrimeNo14
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n,2))
        System.out.println("Its prime");
        else
        System.out.println("Its not prime");
    }
    private static boolean isprime(int n,int i)
    {
        if(n<=2)
        {
            return true;
        }
        if(n%i==0)
        {
            return false;
        }
        if(i*i>n)
        {
            return true;
        }
        return isprime(n, i+1);
    }
}