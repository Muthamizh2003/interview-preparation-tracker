/*
1922. Count Good Numbers
Solved
Medium
Topics
Companies
Hint
A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).

For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
Given an integer n, return the total number of good digit strings of length n. Since the answer may be large, return it modulo 109 + 7.

A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.

 

Example 1:

Input: n = 1
Output: 5
Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".
Example 2:

Input: n = 4
Output: 400
Example 3:

Input: n = 50
Output: 564908303
 

Constraints:

1 <= n <= 1015
 */

public class CountGoodNOS32 {
    
    public static long modPow(long x, long n, long mod) {
        long result = 1;
        x = x % mod;
        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            n /= 2;
        }
        return result;
    }
    
    public static int countGoodNumbers(long n) {
        long MOD = 1000000007;
        long evenContrib = modPow(5, (n + 1) / 2, MOD);
        long oddContrib = modPow(4, n / 2, MOD);
        return (int) ((evenContrib * oddContrib) % MOD);
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1));  
        System.out.println(countGoodNumbers(4));  
        System.out.println(countGoodNumbers(50)); 
    }
}
