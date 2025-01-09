package Recursion;

import java.util.List;

/*
1106. Parsing A Boolean Expression
Solved
Hard
Topics
Companies
Hint
A boolean expression is an expression that evaluates to either true or false. It can be in one of the following shapes:

't' that evaluates to true.
'f' that evaluates to false.
'!(subExpr)' that evaluates to the logical NOT of the inner expression subExpr.
'&(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical AND of the inner expressions subExpr1, subExpr2, ..., subExprn where n >= 1.
'|(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical OR of the inner expressions subExpr1, subExpr2, ..., subExprn where n >= 1.
Given a string expression that represents a boolean expression, return the evaluation of that expression.

It is guaranteed that the given expression is valid and follows the given rules.

 

Example 1:

Input: expression = "&(|(f))"
Output: false
Explanation: 
First, evaluate |(f) --> f. The expression is now "&(f)".
Then, evaluate &(f) --> f. The expression is now "f".
Finally, return false.
Example 2:

Input: expression = "|(f,f,f,t)"
Output: true
Explanation: The evaluation of (false OR false OR false OR true) is true.
Example 3:

Input: expression = "!(&(f,t))"
Output: true
Explanation: 
First, evaluate &(f,t) --> (false AND true) --> false --> f. The expression is now "!(f)".
Then, evaluate !(f) --> NOT false --> true. We return true.
 

Constraints:

1 <= expression.length <= 2 * 104
expression[i] is one following characters: '(', ')', '&', '|', '!', 't', 'f', and ','.
 */
class Solution {
    public boolean parseBoolExpr(String expression) {
        return parse(expression,new int[]{0});     
    }
    private static boolean parse(String expr,int[] i)
    {
        boolean res;
        char c=expr.charAt(i[0]);
        i[0]+=1;
        if(c=='t')
        {
            return true;
        }
        if(c=='f')
        {
            return false;
        }
        if(c=='!')
        {
            i[0]+=1;
            res=!(parse(expr,i));
            i[0]+=1;
            return res;
        }
        
        List<Boolean> bools=new ArrayList<>();
        i[0]+=1;
        while(expr.charAt(i[0])!=')')
        {
            if(expr.charAt(i[0])==',')
            {
                i[0]+=1;    
            }
            else
            {
                bools.add(parse(expr,i));
            }
        }
        i[0]+=1;
        if(c=='&')
        {
            boolean and=true;
            for(int k=0;k<bools.size();k++)
            {
                and=and&bools.get(k);
            }
            return and;
        }
        if(c=='|')
        {
            boolean or=false;
            for(int j=0;j<bools.size();j++)
            {
                or=or|bools.get(j);
            }
            return or;
        }
        return false;
    }
}