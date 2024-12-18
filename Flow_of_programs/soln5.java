package Flow_of_programs;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class soln5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true)
        {
            System.out.println("Enter num or 'X' to stop:");
            String s=sc.next();
            if(s.equals("X"))
            {
                break;
            }
            else
            {
                try
                {
                    int val=Integer.parseInt(s);
                    sum+=val;
                }
                catch(NumberFormatException E)
                {
                    System.out.println(E);
                }
            }
        }
        System.out.println(sum);
    }
}
