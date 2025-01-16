/*
273. Integer to English Words
Solved
Hard
Topics
Companies
Hint
Convert a non-negative integer num to its English words representation.

 

Example 1:

Input: num = 123
Output: "One Hundred Twenty Three"
Example 2:

Input: num = 12345
Output: "Twelve Thousand Three Hundred Forty Five"
Example 3:

Input: num = 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 

Constraints:

0 <= num <= 231 - 1

 */
public class IntegerToEnglish55 {
    
}
class Solution {
    private final String[] below20={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
    private final String[] big={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        if(num==0)
        {
            return "Zero";
        }
        return tell(num);
    }
    private String tell(int num) {
        StringBuilder result = new StringBuilder();
        if (num < 20) {
            result.append(below20[num]);
        } else if (num < 100) {
            result.append(big[num / 10]).append(" ").append(below20[num % 10]);
        } else if (num < 1000) {
            result.append(tell(num / 100)).append(" Hundred ").append(tell(num % 100));
        } else if (num < 1000000) {
            result.append(tell(num / 1000)).append(" Thousand ").append(tell(num % 1000));
        } else if (num < 1000000000) {
            result.append(tell(num / 1000000)).append(" Million ").append(tell(num % 1000000));
        } else {
            result.append(tell(num / 1000000000)).append(" Billion ").append(tell(num % 1000000000));
        }
        return result.toString().trim();
    }
}