//08. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int al[]=new int[n+1];
        al[0]=0;
        int mx=0;
        for(int i=0;i<n;i++)
        {
            al[i+1]=al[i]+gain[i];
        }
        for(int i=0;i<n+1;i++)
        {
            mx=al[i];
            for(int j=0;j<n+1;j++)
            {
                mx=Math.max(mx,al[j]);
            }
            return mx;
            
        }
       return mx;
    }
}