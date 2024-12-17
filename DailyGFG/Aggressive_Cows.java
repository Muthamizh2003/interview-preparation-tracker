//https://www.linkedin.com/posts/muthamizh-kumaran-l-05433724a_gfg160-gfg160-gfg160-activity-7274682453322010624-AS9o?utm_source=share&utm_medium=member_desktop

// User function Template for Java

import java.util.Arrays;

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int l=1;
        int r=stalls[stalls.length-1]-stalls[0];
        int min=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(isvalid(stalls,mid,k))
            {
                min=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return min;
    }
    private static boolean isvalid(int[] stalls,int mid,int k)
    {
        int last=stalls[0];
        int c=1;
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-last>=mid)
            {
                c++;
                last=stalls[i];
            }
            if(c==k)
            {
                return true;
            }
        }
        return false;
    }
}