package DailyLeetCode;

import java.util.Stack;
//public class final_discount_price_(Monotonic_stack) {
    //}
//1.with value
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] res= new int[prices.length];
        for(int i=prices.length-1;i>=0;i--) {
            while(!stack.isEmpty()&&stack.peek()>prices[i]) {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = prices[i];
            } 
            else 
            {
                res[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        return res;
    }
}
//2 with index
class Solution {
    public int[] finalPrices(int[] prices) {
        int res[]=prices.clone();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<prices.length;i++)
        {
            while(!stack.isEmpty()&&prices[stack.peek()]>=prices[i])
            {
                res[stack.pop()]-=prices[i];
            }
            stack.add(i);
        } 
        return res;
    }
}