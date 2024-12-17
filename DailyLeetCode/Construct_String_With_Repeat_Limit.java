package DailyLeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://www.linkedin.com/posts/muthamizh-kumaran-l-05433724a_leetcode-problemoftheday-bruteforce-activity-7274658030896521217-7u0Z?utm_source=share&utm_medium=member_desktop

class Solution {
    class Pair {
        char ch;int freq;
        Pair(char ch,int freq)
        {
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String repeatLimitedString(String s,int repeatLimit) {
        StringBuilder result=new StringBuilder();
        PriorityQueue<Pair> queue=new PriorityQueue<>((a,b)->b.ch-a.ch);
        Map<Character,Integer> freqMap=new HashMap<>();
        for(char c:s.toCharArray())
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        for(Map.Entry<Character,Integer> entry:freqMap.entrySet())
            queue.offer(new Pair(entry.getKey(),entry.getValue()));
        while(!queue.isEmpty()) {
            Pair current=queue.poll();
            int useCount=Math.min(repeatLimit,current.freq);
            for(int i=0;i<useCount;i++)
                result.append(current.ch);
            current.freq-=useCount;
            if(current.freq>0) {
                if(!queue.isEmpty()) {
                    Pair next=queue.poll();
                    result.append(next.ch);
                    next.freq--;
                    if(next.freq>0)
                        queue.offer(next);
                    queue.offer(current);
                }
                else
                    break;
            }
        }
        return result.toString();
    }
}