package AssignmentSolutions.Alphabetpatterns;

/*
02.    E D C B A
       D C B A
       C B A
       B A
       A
 */
import java.util.Scanner;

public class alpha2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(char c=(char) ('A'+n-i-1);c>='A';c--)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
