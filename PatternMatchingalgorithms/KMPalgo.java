package PatternMatchingalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KMPalgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String pat=sc.next();
        List<Integer> arr=new ArrayList<>();
        int m=pat.length();
        int[] lps=new int[m];
        search(str,pat,arr,lps);
        System.out.println(arr);
        for(int i:lps)
        {
            System.out.println(i);
        }
    }
    private static void search(String str,String pat,List<Integer> arr,int[] lps)
    {
        int n=str.length();
        int m=pat.length();
        createlps(lps,pat);
        int i=0;
        int j=0;
        while(i<n)
        {
            if(str.charAt(i)==pat.charAt(j))
            {
                i++;
                j++;
                if(j==m)
                {
                    arr.add(i-j+1);
                    j=lps[j-1];
                }
            }
            else
            {
                if(j!=0)
                {
                    j=lps[j-1];
                }
                else
                {
                    i++;
                }
            }
        }
    }
    private static void createlps(int[] lps,String pat)
    {
        int l=0;
        lps[0]=0;
        int i=1;
        while(i<pat.length())
        {
            if(pat.charAt(i)==pat.charAt(l))
            {
                l++;
                lps[i]=l;
                i++;
            }
            else
            {
                if(l!=0)
                {
                    l=lps[l-1];
                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
}