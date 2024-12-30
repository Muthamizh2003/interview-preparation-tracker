package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString10 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            char[] arr=new char[n]; 
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.next().charAt(0);
            }
            reverseString(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static void reverseString(char[] s) {
            reverse(s,0,s.length-1);
                    }
                    private static void reverse(char[] str,int l,int h)
        {
            if(l>=h)
                return;
            char t=str[l];
            str[l]=str[h];
            str[h]=t;
            reverse(str,l+1,h-1);
        }
}
