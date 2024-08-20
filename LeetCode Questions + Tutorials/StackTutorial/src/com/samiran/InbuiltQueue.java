package com.samiran;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.add(50);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        Deque<Integer> deQueue = new ArrayDeque<>();

        deQueue.addFirst(10);
        deQueue.addFirst(20);
        deQueue.addFirst(30);
        deQueue.addFirst(40);
        deQueue.addFirst(50);
        deQueue.add(60);
        deQueue.addLast(70);
        System.out.println(deQueue.remove());
        System.out.println(deQueue.removeFirst());
        System.out.println(deQueue.removeLast());
    }
}
