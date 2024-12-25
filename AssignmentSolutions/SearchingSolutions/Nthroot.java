/*
Find nth root of m
Difficulty: EasyAccuracy: 25.06%Submissions: 175K+Points: 2
You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.

Examples :

Input: n = 2, m = 9
Output: 3
Explanation: 32 = 9
Input: n = 3, m = 9
Output: -1
Explanation: 3rd root of 9 is not integer.
Input: n = 1, m = 14
Output: 14
Constraints:
1 <= n <= 30
1 <= m <= 109


 */
public class Nthroot {
    
}
class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int l=1;
        int r=m;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int v=pow(mid,n);
            if(v==m)
            {
                return mid;
            }
            else if(v<m)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;
    }
    private static int pow(int mid,int n)
    {
        long ans=1;
        while(n>0)
        {
            if(n%2==1)
            {
                ans*=mid;
                n=n-1;
            }
            else
            {
                mid*=mid;
                n/=2;
            }
        }
        return (int)ans;
    }
}