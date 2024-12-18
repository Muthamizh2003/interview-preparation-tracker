package Flow_of_programs;

import java.util.Scanner;

//Input a year and find whether it is a leap year or not.
public class soln1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if((y%400==0)&&(y%100!=0)||(y%4==0))
        {
            System.out.println("It is leap");
        }
        else
        {
            System.out.println("It is not");
        }
    }    
}
