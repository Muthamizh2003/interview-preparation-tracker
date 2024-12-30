package Recursion;

import java.util.ArrayList;
import java.util.List;

/*
Permutation of a string. Eg Input: "abc". Output: [cba, bca, bac, cab, acb, abc]
 */

import java.util.Scanner;
//using swap
class Permutation69
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<String> perm=new ArrayList<>();
        permutate(s,0,s.length(),perm);
        System.out.println(perm);
    }
    private static void permutate(String s,int st,int n,List<String> res)
    {
        if (st==n) {
            res.add(s); 
            return;
        }
        for(int i=st;i<n;i++)
        {
            s=swap(s,i,st);
            permutate(s, st+1, n, res);
            s=swap(s,i,st);
        
        }
    }
    private static String swap(String s, int i, int j) {
        char[] ch=s.toCharArray();
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
        return new String(ch);
    }           
}