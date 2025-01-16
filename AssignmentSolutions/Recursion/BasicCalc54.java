/*
224. Basic Calculator
Solved
Hard
Topics
Companies
Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

 

Example 1:

Input: s = "1 + 1"
Output: 2
Example 2:

Input: s = " 2-1 + 2 "
Output: 3
Example 3:

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
 

Constraints:

1 <= s.length <= 3 * 105
s consists of digits, '+', '-', '(', ')', and ' '.
s represents a valid expression.
'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
There will be no two consecutive operators in the input.
Every number and running calculation will fit in a signed 32-bit integer.
 */
public class BasicCalc54 {

}
class Solution {
    public int calculate(String s) {
        return evaluate(s,new int[]{0});    
    }
    private static int evaluate(String s,int[] i)
    {
        int res=0;
        int num=0;
        int sign=1;
        while(i[0]<s.length())
        {
            if(s.charAt(i[0])-'0'>=0&&s.charAt(i[0])-'0'<=9)
            {
                num=num*10+s.charAt(i[0])-'0';
            }
            else if(s.charAt(i[0])=='(')
            {
                i[0]++;
                num=evaluate(s,i);
            }
            else if(s.charAt(i[0])==')')
            {
                res+=num*sign;
                return res;
            }
            else if(s.charAt(i[0])=='+')
            {
                res+=sign*num;
                num=0;
                sign=1;
            }
            else if(s.charAt(i[0])=='-')
            {
                res+=sign*num;
                num=0;
                sign=-1;
            }
            i[0]++;
        }
        res+=num*sign;
        return res;
    }
}