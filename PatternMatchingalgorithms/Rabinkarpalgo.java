package PatternMatchingalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//O(n+m)
//hash=(hash-(text[i-patlen]*(b^(patlen-1))%p)*b+text[i]
public class Rabinkarpalgo {
    public final static int d=256;
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            String pat=sc.next();
            List<Integer> arr=new ArrayList<>();
            int q=sc.nextInt();
            findindices(arr,s,pat,q);
            System.out.println(arr);
        }
        private static void findindices(List<Integer> arr,String s,String pat,int q)
        {
            int m=pat.length();  
            int n=s.length();
            int i,j, p=0,t=0,h=1;
            for(i=0;i<m-1;i++)
            {
                h=(h*d)%q;
            } 
            for(i=0;i<m;i++)
            {
                p=(d*p+pat.charAt(i))%q;
                t=(d*t+s.charAt(i))%q;
            }
            for(i=0;i<=n-m;i++)
            {
                if(p==t)
                {
                    for(j=0;j<m;j++){
                        if(s.charAt(i+j)!=pat.charAt(j))
                        {
                            break;
                        }
                    }
                    if(j==m)
                    {
                        arr.add(i);
                    }
                }
                if(i<n-m)
                {
                    t=(d*(t-s.charAt(i)*h)+s.charAt(i+m))%q;
                    if(t<0)
                    {
                        t=t+q;
                    }
                }
            }
    }
}
