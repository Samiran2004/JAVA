package com.samiran.stackusinglinkedlist;

public class Main {
    private Node head = null;
    private Node tail = null;
    private int size;
    private static final int DEFAULT_SIZE = 10;
    private int stackPtr;

    Main(){
        this(DEFAULT_SIZE);
    }
    Main(int size){
        this.size = size;
        this.stackPtr = 0;
    }

    public boolean isFull(){
        return stackPtr == size;
    }
    public boolean isEmpty(){
        return stackPtr == 0;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Stack Overflow...");
            return;
        } else if (isEmpty()) {
            stackPtr++;
            Node newNode = new Node(data);
            head = newNode;
            tail = newNode;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
        stackPtr++;
        return;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            System.out.println("Stack underflow...");
            throw new Exception("Stack Underflow...");
        }

        int popData;
        if (head == tail) {
            popData = head.data;
            head = null;
            tail = null;
        } else {
            Node currNode = head;
            while (currNode.next != tail) {
                currNode = currNode.next;
            }
            popData = tail.data;
            tail = currNode;
            tail.next = null;
        }
        stackPtr--;
        return popData;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            System.out.println("Stack underflow...");
            throw new Exception("Stack is empty...");
        }
        return tail.data;
    }

    public static void main(String[] args) throws Exception{
        Main stack = new Main(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
