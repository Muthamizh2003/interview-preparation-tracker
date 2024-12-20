package StriversSheet.Arrays.Hard;

import java.util.ArrayList;

/*
Missing And Repeating
Difficulty: EasyAccuracy: 24.83%Submissions: 536K+Points: 2
Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.

Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].

Examples:

Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and smallest positive missing number is 1.
Input: arr[] = [1, 3, 3] 
Output: [3, 2]
Explanation: Repeating number is 3 and smallest positive missing number is 2.
Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: Repeating number is 1 and the missing number is 5.
Constraints:
2 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size()
 */

public class MissingandRepeating {
    
}

//1.by using -ve for count using index and if(arr[math.abs-1])<0 dup found check which is great>0 that is our value

// User function Template for Java

class Solution {
    public ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            if (arr[absValue - 1] > 0) {
                arr[absValue - 1] = -arr[absValue - 1];
            } else {
                result.add(absValue);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result.add(i + 1);
                break;
            }
        }

        return result;
    }
}

/*
using math sum of squares and sum of first n (x1+x2)(x1-x2)/(x1-x2)=>clue;
 */
class Solution2 {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        long s1=(long) (n*(n+1))/2;
        long s2= (long)(n*(n+1)*(2*n+1))/6;
        long s=0,sq=0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
            sq+=(long)arr[i]*(long)arr[i];
        }
        long X=s1-s;
        long Y=s2-sq;
        Y=Y/X;
        long x=(X+Y)/2;
        long y=x-X;
        ArrayList<Integer> array=new ArrayList<>();
        array.add((int)y);
        array.add((int)x);
        return array;
    }
}

//using XOR
// User function Template for Java
class Solution3 {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length; // size of the array
        int xr = 0;

        //Step 1: Find XOR of all elements:
        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];
            xr = xr ^ (i + 1);
        }//ex=>4 

        //Step 2: Find the differentiating bit number:
        int number = (xr & ~(xr - 1));//number=2-digit

        //Step 3: Group the numbers:
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            //part of 1 group:
            if ((arr[i] & number) != 0) {
                one = one ^ arr[i];
            }
            //part of 0 group:
            else {
                zero = zero ^ arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            //part of 1 group:
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group:
            else {
                zero = zero ^ i;
            }
        }

        // Last step: Identify the numbers:
        ArrayList<Integer> array=new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == zero) cnt++;
        }
        if (cnt == 2) 
        {
            array.add(zero); 
            array.add(one);
            return array;
        }
        array.add(one); 
        array.add(zero);
        return array;
    }
}