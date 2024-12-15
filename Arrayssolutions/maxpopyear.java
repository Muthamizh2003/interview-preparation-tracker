//09. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
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