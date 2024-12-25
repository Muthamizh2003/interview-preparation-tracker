package 2Darraysolutions;
//02. [Kids With the Greatest Number of Candies]
//(https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bools=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int val=candies[i]+extraCandies;
            boolean isvalid=true;
            for(int j=0;j<candies.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(val<candies[j])
                {
                    isvalid=false;
                    break;
                }
            }   
            bools.add(isvalid);
        }   
        return bools; 
    }
}
