package PatternMatchingalgorithms;

import java.util.Scanner;

public class Naivealgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String pat=sc.next();
        int m=str.length();
        int n=pat.length();
        int val=search(str,pat,m,n);
        System.out.println("The pattern found at "+ val);
    }
    private static int search(String str, String pat,int m,int n) {
        for(int i=0;i<=m-n;i++){
            int j;
            for(j=0;j<n;j++)
            {
                if(str.charAt(i+j)!=pat.charAt(j))
                {
                    break;
                }
            }
            if(j==n)
                return i+1;
        }
        return -1;
    }
}
