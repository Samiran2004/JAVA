package com.queue.customimp;

public class CustomQueue {
    private Node front;
    private Node rear;
    private int size;
    public CustomQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        size++;
        if (rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() throws QueueException{
        if (front == null){
            throw new QueueException("Queue is empty...");
        }
        int dequeueData = front.data;
        front = front.next;
        size--;
        return dequeueData;
    }

    public int peek() throws QueueException{
        if (front == null){
            throw new QueueException("Queue is empty...");
        }
        return front.data;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) throws QueueException{
        CustomQueue queue = new CustomQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue());

        System.out.println(queue.getSize());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.peek());

        System.out.println(queue.dequeue());

        System.out.println(queue.peek());
    }
}