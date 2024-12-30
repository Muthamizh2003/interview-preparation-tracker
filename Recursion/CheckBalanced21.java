package Recursion;

import java.util.Scanner;
import java.util.Stack;
//using stack
// public class CheckBalanced21 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         Stack<Character> st = new Stack<>();
//         System.out.println(isBalanced(st, str, 0) && st.isEmpty());
//     }
//     private static boolean isBalanced(Stack<Character> st, String str, int i) {
//         if (i == str.length()) {
//             return st.isEmpty();
//         }
//         char it = str.charAt(i);
//         if (it == '(' || it == '[' || it == '{') {
//             st.push(it);
//         } else {
//             if (st.isEmpty()) {
//                 return false;
//             }
//             char ch = st.pop();
//             if ((it == ')' && ch != '(') || (it == ']' && ch != '[') || (it == '}' && ch != '{')) {
//                 return false;
//             }
//         }
//         return isBalanced(st, str, i + 1);
//     }
// }

// using count
import java.util.Scanner;

public class CheckBalanced21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isBalanced(str, 0, new char[1000], 0));
    }

    private static boolean isBalanced(String str, int i, char[] stack, int top) {
        if (i == str.length()) {
            return top == 0;
        }
        char c = str.charAt(i);
        if (c == '(' || c == '[' || c == '{') {
            stack[top] = c;
            return isBalanced(str, i + 1, stack, top + 1);
        }
        if (c == ')' || c == ']' || c == '}') {
            if (top == 0) {
                return false;
            }
            char lastOpeningBracket = stack[top - 1];
            if ((c == ')' && lastOpeningBracket == '(') ||
                (c == ']' && lastOpeningBracket == '[') ||
                (c == '}' && lastOpeningBracket == '{')) {
                return isBalanced(str, i + 1, stack, top - 1);
            } else {
                return false;
            }
        }
        return isBalanced(str, i + 1, stack, top);
    }
}
