package Flowchart_pseudoCode;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        if(name.equals("Sam")||name.equals("Dean"))
        System.out.println("Hello, " + name + "!");
    }
}

