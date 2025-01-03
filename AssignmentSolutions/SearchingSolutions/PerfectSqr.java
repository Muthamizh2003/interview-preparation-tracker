/*
367. Valid Perfect Square
Solved
Easy
Topics
Companies
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 

Constraints:

1 <= num <= 231 - 1
 */
public class PerfectSqr {
    
}
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1)
        {
            return false;
        } 
        int l=1;
        int r=num;
        while(l<=r)
        {
            int mid=(l+r)>>1;
            long v=(long)mid*(long)mid;
            if(v==num)
            {
                return true;
            }
            else if(v<num)
            {
                l=mid+1;
            } 
            else
            {
                r=mid-1;
            }
        }   
        return false;
    }
}
