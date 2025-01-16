package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class SortStack43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            stack.push(sc.nextInt());
        }
        sort(stack);
        System.out.println("the sorted stack :");
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }  
    private static void sort(Stack<Integer> stack)
    {
        if(!stack.isEmpty())
        {
            int x=stack.pop();
            sort(stack);
            pushval(stack,x);
        }
    }
    private static void pushval(Stack<Integer> stack,int x)
    {
        if(stack.isEmpty()||x>stack.peek())
        {
            stack.push(x);
            return;
        }
        else
        {
            int temp=stack.pop();
            pushval(stack, x);
            stack.push(temp);
        }
    }
}
