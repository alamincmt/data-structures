package com.company;

public class Stack {

    private int[] arr;
    private int top;
    private int capacity;

    // Creating the stack
    public Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements to the stack
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full. \nProgram Terminated. ");
            System.exit(1);
        }

        System.out.println("Inserting value: " + value);
        arr[++top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.\nProgram terminated.");
            System.exit(1);
        }

        return arr[top--];
    }

    public int size(){
        return top+1;
    }

    // Check empty status
    public boolean isEmpty(){
        return top == -1;
    }

    // Check stack fill status
    public boolean isFull(){
        return top == capacity-1;
    }

    // print stack values
    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.println(arr[i]);
        }
    }

}
