/*
Next Happy Number
Difficulty: HardAccuracy: 53.97%Submissions: 35K+Points: 8
For a given non-negative integer N, find the next smallest Happy Number. A number is called Happy if it leads to 1 after a sequence of steps. Wherein at each step the number is replaced by the sum of squares of its digits that is, if we start with Happy Number and keep replacing it with sum of squares of its digits, we reach 1 at some point.
 
Example 1:

Input:
N = 8
Output:
10
Explanation:
Next happy number after 8 is 10 since
1*1 + 0*0 = 1
Example 2:

Input:
N = 10
Output
13
Explanation:
After 10, 13 is the smallest happy number because
1*1 + 3*3 = 10, so we replace 13 by 10 and 1*1 + 0*0 = 1.
Your Task:
You don't need to read input or print anything. Your task is to complete the function nextHappy() which takes an integer N as input parameters and returns an integer, next Happy number after N.

Expected Time Complexity: O(Nlog10N)
Expected Space Complexity: O(1)
 
Constraints:
1<=N<=105
 */
public class NextHappyNo53 {
    
}
class Solution{

    static int nextHappy(int N){
        // code here
        while(true)
        {
            N++;
            if(solve(N))
            {
                return N;
            }
        }
    }
    private static boolean solve(int n)
    {
        if(n==1||n==7)
        {
            return true;
        }
        if(n==2||n==3||n==4||n==5||n==6||n==8||n==9)
        {
            return false;
        }
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum+=x*x;
            n=n/10;
        }
        return solve(sum);
    }
}