package com.samiran.customimp;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return end == 0;
    }
    public boolean isFull(){
        return end == data.length;
    }

    public boolean enqueue(int data){
        if (isFull()){
            return false;
        }
        this.data[end++] = data;
        return true;
    }

    public int dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty...");
        }
        int dequeueData = data[0];
        for (int i = 1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return dequeueData;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty...");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i<end; i++){
            System.out.print(data[i]+"  ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.peek());
        queue.display();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.peek());
    }
}
