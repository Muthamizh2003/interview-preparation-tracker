package NumberPatterns;

import java.util.Scanner;

/*
11.    1
       1 1
       2 1
       1 2 1 1
       1 1 1 2 2 1
 */
public class number11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        String res=countAndSay(i);
        for (char c : res.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
        }
    }
    public static String countAndSay(int n) {
        if (n == 1)
            return "1";
        String str = "1";
        for (int i = 2; i <= n; i++) {
            String nextString = "";
            int cnt = 1;
            char ch = str.charAt(0);
            for (int j = 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    cnt++;
                } else {
                     nextString += cnt + "" + ch + "";
                    ch = str.charAt(j);
                    cnt = 1;
                }
            }
            nextString += cnt + "" + ch + "";
            str = nextString.trim();
        }
        return str;
    }
}
