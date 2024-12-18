import java.util.Arrays;

public class AllocateMinimumPagesbinsearch {
    
}
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)
        {
            return -1;
        }
        return findvalidpages(arr,k);
    }
    private static int findvalidpages(int[] arr,int cuts)
    {
        int l=Arrays.stream(arr).max().getAsInt();
        int r=Arrays.stream(arr).sum();
        int res=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(isvalidcuts(arr,mid,cuts))
            {
                res=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return res;
    }
    private static boolean isvalidcuts(int[] arr,int max,int k)
    {
        int sum=0;
        int cuts=1;
        for(int i:arr)
        {
            if(sum+i<=max)
            {
                sum+=i;
            }
            else
            {
                cuts++;
                sum=i;
                if(cuts>k)
                {
                    return false;
                }
            }
        }
        return cuts<=k;
    }
}