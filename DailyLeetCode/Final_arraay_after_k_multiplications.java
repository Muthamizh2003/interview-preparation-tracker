package DailyLeetCode;

import java.util.PriorityQueue;

class Solution {
    class Pair
    {
        int val,ind;
        Pair(int val,int ind)
        {
            this.val=val;
            this.ind=ind;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] newarr=new int[nums.length];
        PriorityQueue<Pair> queue=new PriorityQueue<>((a,b)->{
            if(a.val==b.val)return Integer.compare(a.ind,b.ind);
            else return Integer.compare(a.val,b.val);
        });           
        for(int i=0;i<nums.length;i++)
        {
            queue.add(new Pair(nums[i],i));
        }
        for(int i=0;i<k;i++)
        {
            Pair p=queue.poll();
            int newval=p.val*multiplier;
            int index=p.ind;
            queue.add(new Pair(newval,index));
        }
        while(!queue.isEmpty())
        {
            Pair values=queue.poll();
            int index=values.ind;
            int value=values.val;
            newarr[index]=value;
        }
        return newarr;
    }
}