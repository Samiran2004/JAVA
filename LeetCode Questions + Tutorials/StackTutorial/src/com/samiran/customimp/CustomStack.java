package com.samiran.customimp;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean push(int data){
        if (isFull()){
            System.out.println("Stack Overflow...");
            return false;
        }
        ptr++;
        this.data[ptr] = data;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        int removedItem = data[ptr];
        ptr--;
        return removedItem;
    }

    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
//        stack.push(60);
//        stack.push(70);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
