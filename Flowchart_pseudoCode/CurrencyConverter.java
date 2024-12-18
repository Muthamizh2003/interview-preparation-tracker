package Flowchart_pseudoCode;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double conversionRate = 0.012;

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        double usd = inr * conversionRate;
        System.out.printf("Amount in USD: %.2f\n", usd);
    }
}

