package Flowchart_pseudoCode;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double T = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double R = sc.nextDouble();
        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest: " + SI);
    }
}
