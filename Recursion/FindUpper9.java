package Recursion;

import java.util.Scanner;

public class FindUpper9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=findcaps(s,0,-1);
        System.out.println(s.charAt(c));
    }
    private static int findcaps(String str,int id,int val)
    {
        if(id<str.length())
        {
        if(Character.isUpperCase(str.charAt(id)))
        {
            val=id;
            return val;
        }
        }
        return findcaps(str, id+1,val);
}
        
}
