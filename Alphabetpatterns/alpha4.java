package Alphabetpatterns;

import java.util.Scanner;

/*
04.   H      O
        E   L
          L
        E   L
      H      O
 */
public class alpha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int left = 0, right = n - 1;
        while (left < right) {
            for (int i = 0; i < n; i++) {
                if (i == left) System.out.print(str.charAt(left));
                else if (i == right) System.out.print(str.charAt(right));
                else System.out.print(" ");
            }
            System.out.println();
            left++;
            right--;
        }
        System.out.println("  " + str.charAt(left));
        left--;
        right++;
        while (left >= 0) {
            for (int i = 0; i < n; i++) {
                if (i == left) System.out.print(str.charAt(left));
                else if (i == right) System.out.print(str.charAt(right));
                else System.out.print(" ");
            }
            System.out.println();
            left--;
            right++;
        }
    }
}