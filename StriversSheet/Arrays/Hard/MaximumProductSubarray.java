package StriversSheet.Arrays.Hard;

public class MaximumProductSubarray {
    
}
//observation-Best approach
class Solution {
    public int maxProduct(int[] nums) {
        int pref=1;
        int suf=1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(pref==0)
                pref=1;
            if(suf==0)
                suf=1;
            pref*=nums[i];
            suf*=nums[n-i-1];
            max=Math.max(max,Math.max(pref,suf));
        }     
        return max;
    }
}
//Kadanes appproach

