package Flowchart_pseudoCode;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = sc.nextInt();
        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        for (int num = lower; num <= upper; num++) {
            int sum = 0, temp = num, digits = String.valueOf(num).length();
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}

