package com.samiran.questions;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;

    public QueueUsingStack() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
    }

    public boolean isEmpty() {
        return firstStack.isEmpty();
    }

    public void add(int data) {
        firstStack.push(data);
    }

    public int pop() {
        while (!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }
        int removeData = secondStack.pop();
        while (!secondStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }
        return removeData;
    }

    public int peek() {
        while (!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }
        int peekData = secondStack.peek();
        while (!secondStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }
        return peekData;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.pop());
    }
}
