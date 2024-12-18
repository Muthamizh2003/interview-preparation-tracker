//09. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
/*
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.

 

Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2:

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation: 
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 

Constraints:

1 <= logs.length <= 100
1950 <= birthi < deathi <= 2050
 */
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] pop = new int[2051];
        for (int[] l : logs) {
            pop[l[0]]++;
            pop[l[1]]--;
        }
        int max = 0, y = 1950, cur = 0;
        for (int i = 1950; i <= 2050; i++) {
            cur += pop[i];
            if (cur > max) {
                max = cur;
                y = i;
            }
        }
        return y;
    }
}
//so the idea [1950.....2050 based on cons]
//[1,0.....1,-1,......1,-1.....]
//[st+1,death-1]because the death of a person is not taken ,its like taking the person alive in an interval
//algo->line sweep