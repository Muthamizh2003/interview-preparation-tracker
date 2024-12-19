package StriversSheet.Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://www.interviewbit.com/problems/subarray-with-given-xor/
/*
Subarray with given XOR
Programming
Hashing
medium
52.6% Success

928

19

Bookmark
Asked In:
Problem Description
 
 

Given an array of integers A and an integer B.

Find the total number of subarrays having bitwise XOR of all elements equals to B.



Problem Constraints
1 <= length of the array <= 105

1 <= A[i], B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the total number of subarrays having bitwise XOR equals to B.



Example Input
Input 1:

 A = [4, 2, 2, 6, 4]
 B = 6
Input 2:

 A = [5, 6, 7, 8, 9]
 B = 5


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The subarrays having XOR of their elements as 6 are:
 [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
Explanation 2:

 The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]
 */

/*
x=pref^k
k=>6 for the case initially put(0,1) in map because pref=[4,6,4,2,6]
1) 4^0=>4 by formula wk.t "end points" map={(0,1),(4,1)} c=0
2) 4^2=>6 by form check if 6^6=0 in map yes map={(0,1),(4,1),(6,1)} c=1
3) 6^2=>4 by check 4^6=2 not in map but keep track map={(0,1),(4,2),(6,1)}
4) 4^6=>2 {(0,1),(4,2),(6,1),{2,1}} 2^6=>4 so c+=2=> c=3
5) 2^6=>4 {(0,1),(4,3),(6,1),{2,1}} 4^6=>2 so c+=1=> c=4 "ans"
 */



public class SubarrayWithXOR {
    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pref=0;
        int c=0;
        for(int i=0;i<A.size();i++)
        {
            pref^=A.get(i);
            int x=pref^B;
            if(map.containsKey(x))
            {
                c+=map.get(x);    
            }
            if(map.containsKey(pref))
            {
                map.put(pref,map.get(pref)+1);
            }
            else
            {
                map.put(pref,1);
            }
        }
        return c;
    }
}
