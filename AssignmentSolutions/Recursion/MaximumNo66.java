package Recursion;

import java.util.Scanner;

/*
Given a string s and an integer k, the task is to find the maximum possible number by performing swap operations on the digits of s at most k times.

Examples: 

Input: s = “7599”, k = 2
Output: 9975
Explanation: Swap 9 with 5 so number becomes 7995, Swap 9 with 7 so number becomes 9975


Input: s = “76543”, k = 1 
Output: 76543
Explanation: No swap is required.


 */

// public class MaximumNo66 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int k = sc.nextInt();
//         System.out.println(maximum(s, k, 0, s));
//     }

//     private static String maximum(String str, int k, int start, String max) {
//         if (k == 0 || start == str.length()) {
//             return max;
//         }
//         char[] arr = str.toCharArray();
//         for (int i = start; i < str.length(); i++) {
//             for (int j = i + 1; j < str.length(); j++) {
//                 if (arr[i] != arr[j]) {
//                     swap(arr, i, j);
//                     String newStr = new String(arr);
//                     if (Integer.parseInt(newStr) > Integer.parseInt(max)) {
//                         max = newStr;
//                     }
//                     max = maximum(newStr, k - 1, i + 1, max);
//                     swap(arr, i, j);
//                 }
//             }
//         }
//         return max;
//     }
//     private static void swap(char[] arr, int i, int j) {
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }
//optimised

public class MaximumNo66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(maximum(str, k));
    }

    private static String maximum(String str, int k) {
        StringBuilder s = new StringBuilder(str);
        findit(new StringBuilder(str), k, 0, s);
        return s.toString();
    }

    private static void findit(StringBuilder str, int k, int start, StringBuilder max) {
        if (k == 0 || start == str.length()) {
            if (str.toString().compareTo(max.toString()) > 0) {
                max.replace(0, max.length(), str.toString());
            }
            return;
        }

        int maxDigit = 0;
        for (int i = start; i < str.length(); i++) {
            maxDigit = Math.max(maxDigit, str.charAt(i) - '0');
        }

        if (str.charAt(start) - '0' == maxDigit) {
            findit(str, k, start + 1, max);
        } else {
            for (int i = start + 1; i < str.length(); i++) {
                if (str.charAt(i) - '0' == maxDigit) {
                    char temp = str.charAt(start);
                    str.setCharAt(start, str.charAt(i));
                    str.setCharAt(i, temp);

                    findit(str, k - 1, start + 1, max);

                    str.setCharAt(i, str.charAt(start));
                    str.setCharAt(start, temp);
                }
            }
        }
    }
}
