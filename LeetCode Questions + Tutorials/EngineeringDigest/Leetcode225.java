import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
    }

    public int pop() {
        return this.queue2.poll();
    }

    public int top() {
        return this.queue2.peek();
    }

    public boolean empty() {
        return this.queue2.isEmpty();
    }
}

public class Leetcode225 {
    public static void main(String[] args) {

    }
}
