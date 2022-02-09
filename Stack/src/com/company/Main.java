package com.company;

public class Main {

    public static void main(String[] args) {

        // Stack Example
        Stack stack = new Stack(5);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        stack.printStack();

        System.out.println("Pop from stack: " + stack.pop());
        stack.printStack();

    }
}
