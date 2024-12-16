//13. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)

import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr=new ArrayList<>();
        for(int i=num.length-1;i>=0||k>0;i--)
        {
            if(i>=0)
            {
                k+=num[i];
            }
            arr.add(0,k%10);
            k/=10;
        }
        return arr;
    }
}