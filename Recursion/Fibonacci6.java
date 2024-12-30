package Recursion;

import java.util.Scanner;

// public class Fibonacci6 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
        
//        for(int i=0;i<n;i++)
//        {
//             System.out.println(findfibo(i));
//        }
//     }
//     private static int findfibo(int n)
//     {
//         if(n==0)
//             return 0;
//         if(n==1)
//             return 1;
//         return findfibo(n-1)+findfibo(n-2);
//     }
// }
//recur

public class Fibonacci6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        findfibo(0,1,n);
    }
    private static void findfibo(int p,int c,int n)
    {
        if(n==0)
        {
            return ;
        }
        System.out.println(p);
        int t=c;
        c=c+p;
        p=t;
        findfibo(p,c,n-1);

    }
}