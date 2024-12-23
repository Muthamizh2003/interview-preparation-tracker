// User function Template for Java
/*
Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

Examples :

Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
Input: a[] = [100, 112, 256, 349, 770], b[] = [72, 86, 113, 119, 265, 445, 892], k = 7
Output: 256
Explanation: Combined sorted array is [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]. The 7th element of this array is 256.
Constraints:

1 <= a.size(), b.size() <= 106
1 <= k <= a.size() + b.size()
0 <= a[i], b[i] < 108

 */
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        if(a.length>b.length) return kthElement(b,a,k);
        int n=a.length;
        int m=b.length;
        int l=Math.max(0,k-m);
        int r=Math.min(k,n);
        while(l<=r)
        {
            int c1=(l+r)/2;
            int c2=k-c1;
            int l1=(c1==0)?Integer.MIN_VALUE:a[c1-1];
            int l2=(c2==0)?Integer.MIN_VALUE:b[c2-1];
            int r1=(c1==n)?Integer.MAX_VALUE:a[c1];
            int r2=(c2==m)?Integer.MAX_VALUE:b[c2];
            if(l1<=r2&&l2<=r1)
            {
                return Math.max(l1,l2);
            }
            else if(l1>l2)
            {
                r=c1-1;
            }
            else
            {
                l=c1+1;
            }
        }
        return -1;
    }
}
//O(n+m)
class Solution2 {
    public int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0, count = 0;
        int result = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result = a[i];
                i++;
            } else {
                result = b[j];
                j++;
            }
            count++;
            if (count == k) return result;
        }

        while (i < a.length) {
            result = a[i];
            i++;
            count++;
            if (count == k) return result;
        }

        while (j < b.length) {
            result = b[j];
            j++;
            count++;
            if (count == k) return result;
        }

        return -1;
    }
}
