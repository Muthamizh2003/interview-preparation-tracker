package AssignmentSolutions.NumberPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
10.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
 */
//pascal triangle
public class number10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> arr=generate(n);
        for(int i=0;i<arr.size();i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<arr.get(i).size();j++)
            {
                System.out.print(" "+arr.get(i).get(j)+"  ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        generateall(res,numRows);    
                return res;
            }
    private static void generateall(List<List<Integer>> res,int n)
    {
        if(n==0)
        {
            return;
        }
        generateall(res,n-1);
        List<Integer> cur=new ArrayList<>();
        List<Integer> prev=res.isEmpty() ? null : res.get(res.size() - 1);
        cur.add(1);
        if (prev != null) {
            for (int i = 1; i < n - 1; i++) {
                cur.add(prev.get(i - 1) + prev.get(i));
            }
        }
        if (n > 1) {
            cur.add(1);
        }
        res.add(cur);
    }
}
