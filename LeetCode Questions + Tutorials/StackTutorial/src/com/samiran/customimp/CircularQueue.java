package com.samiran.customimp;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front = 0;
    private int end = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int data){
        if (isFull()){
            return false;
        }
        this.data[end++] = data;
        end = end % this.data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty..");
        }
        int removedData = this.data[front];
        front = (front + 1) % this.data.length;
        size--;
        return removedData;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty...");
        }
        return this.data[front];
    }

    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
    }
}
