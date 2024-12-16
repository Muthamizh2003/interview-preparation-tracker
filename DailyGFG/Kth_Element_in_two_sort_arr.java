//gap method 


// User function Template for Java

class Solution1 {
    public int kthElement(int a[], int b[], int k) {
        int n = a.length, m = b.length, gap = (n + m + 1) / 2;
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                if (j < n && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else if (j >= n && i < n && a[i] > b[j - n]) {
                    int temp = a[i];
                    a[i] = b[j - n];
                    b[j - n] = temp;
                } else if (i >= n && j >= n && b[i - n] > b[j - n]) {
                    int temp = b[i - n];
                    b[i - n] = b[j - n];
                    b[j - n] = temp;
                }
                i++;
                j++;
            }
            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
        return k <= n ? a[k - 1] : b[k - n - 1];
    }
}

//binsearch with cuts and small arrays


// User function Template for Java

class Solution2 {
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