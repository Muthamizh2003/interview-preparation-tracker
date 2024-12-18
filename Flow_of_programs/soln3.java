package Flow_of_programs;

import java.util.Scanner;

public class soln3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(true)
        {
            System.out.println(n*i);
            if(i==10)
                break;
            i++;
        }

    }
}
