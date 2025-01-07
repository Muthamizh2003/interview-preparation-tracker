import java.util.ArrayList;

public class NIncreasing33 {
    
}
/*
N Digit numbers with digits in increasing order
Difficulty: MediumAccuracy: 49.66%Submissions: 12K+Points: 4
Given an integer n, print all the n digit numbers in increasing order, such that their digits are in strictly increasing order(from left to right).

Example 1:

Input:
n = 1
Output:
0 1 2 3 4 5 6 7 8 9
Explanation:
Single digit numbers are considered to be 
strictly increasing order.
Example 2:

Input:
n = 2
Output:
12 13 14 15 16 17 18 19 23....79 89
Explanation:
For n = 2, the correct sequence is
12 13 14 15 16 17 18 19 23 and so on 
up to 89.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function increasingNumbers() which takes an integer n as an input parameter and returns the list of numbers such that their digits are in strictly increasing order.

Expected Time Complexity: O(9n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 9
 */
class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        All(n,"",0,res);
        return res;
    }
    private static void All(int n,String str,int start,ArrayList<Integer> res)
    {
        
        if(n==str.length())
        {
            int ss=Integer.parseInt(str);
            String ans=Integer.toString(ss);
            if(n==ans.length())
            {
            int s=Integer.parseInt(ans);
            res.add(s);
            return;
            }
            return;
        }
        for(int i=start;i<=9;i++)
        {
            str+=i;
            All(n,str,i+1,res);
            str=str.substring(0,str.length()-1);
        }
    }
}