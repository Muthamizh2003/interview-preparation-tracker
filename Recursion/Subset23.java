package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> subset=new ArrayList<>();
        String s=sc.next();
        int c=0;
        subset=findallsubsets("",s,c);
        System.out.println(subset);
        c=subsetCount(s,"");
        System.out.println(c);
    }
    private static List<String> findallsubsets(String sub,String s,int c)
    {
        if(s.isEmpty())
        {
            List<String> res=new ArrayList<>();
            res.add(sub);
            c+=res.size();
            return res;
        }
        List<String> res=new ArrayList<>();
        char ch=s.charAt(0);
        res.addAll(findallsubsets(sub+ch, s.substring(1),c));
        res.addAll(findallsubsets(sub, s.substring(1),c));

        return res;
    }
    private static int subsetCount(String s,String sub) {
        if (s.isEmpty()) {
            return 1; 
        }
        int include=subsetCount(s.substring(1),sub+s.charAt(0));
        int exclude=subsetCount(s.substring(1),sub);
        return include+exclude;
    }
}
