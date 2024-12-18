package Flow_of_programs;
//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class soln4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=gcd(n,m);
        int b=lcm(n,m,a);
        System.out.println("LCM :"+b+" GCD :"+a);
    }
    private static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    private static int lcm(int a,int b,int gcd)
    {
        return Math.abs((a*b)/gcd);
    }
}
