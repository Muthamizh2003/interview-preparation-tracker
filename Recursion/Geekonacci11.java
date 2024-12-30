package Recursion;


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Geekonacci {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    int N=sc.nextInt();
		    System.out.println(findgeeko(A,B,C,N));
		}
	}
	private static int findgeeko(int a,int b,int c,int n)
	{
	    if(n==1)
	    {
	        return a;
	    }
	    if(n==2)
	    {
	        return b;
	    }
	    if(n==3)
	    {
	        return c;
	    }
	    return findgeeko(a,b,c,n-1)+findgeeko(a,b,c,n-2)+findgeeko(a,b,c,n-3);
	}
}