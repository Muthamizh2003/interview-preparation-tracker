//15. [Find N Unique Integers Sum up to Zero]
//(https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
class Solution {
    public int[] sumZero(int n) {
    int[] ans = new int[n];
        int start = 0;
        int end = n - 1;
        
        while(start < end){
            ans[start] = start + 1;
            ans[end] = ans[start] * (-1);
            start++;
            end--;
        }
        
        return ans;        
    }
}
