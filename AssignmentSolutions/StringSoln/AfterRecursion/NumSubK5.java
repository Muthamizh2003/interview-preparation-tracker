package AssignmentSolutions.StringSoln.AfterRecursion;

public class NumSubK5 {
    
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int avg=0;
        int n=arr.length;
        int l=0;
        int r=0;
        int c=0;
        while(r<n)    
        {
            avg+=arr[r];
            if(r-l+1==k)
            {
                if((avg/k)>=threshold)
                {
                    c++;  
                }
                avg-=arr[l];
                l++;
            }
            r++;
        }
        return c;
    }
}