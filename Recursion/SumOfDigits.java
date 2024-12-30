package Recursion;

import java.util.Scanner;

/*
Sum of digit of a number using recursion
Last Updated : 02 Jun, 2024
Given a number, we need to find sum of its digits using recursion.
Examples: 
 

Input : 12345
Output : 15

Input : 45632
Output :20
          
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n,0));
    }    
    private static int sum(int n,int sum)
    {
        if(n<=0)
        {
            return sum;
        }
        sum+=n%10;
        return sum(n/10,sum);
    }
}
