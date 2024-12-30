package Recursion;

import java.util.Scanner;

public class RemoveDups22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s=RemoveDups(str);
        System.out.println(s);
    }
    private static String RemoveDups(String str)
    {
        if(str.length()<=1)
        {
            return str; 
        }
        else if(str.charAt(0)==str.charAt(1))
        {
            return RemoveDups(str.substring(1));
        }
        else
        {
            return str.charAt(0)+RemoveDups(str.substring(1));
        }
    }
}
