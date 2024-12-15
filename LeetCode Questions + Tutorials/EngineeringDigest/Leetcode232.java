import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if (stack2.isEmpty()) {
            stack2.add(x);
        } else {
            while (!stack2.isEmpty()) {
                stack1.add(stack2.pop());
            }
            stack2.add(x);
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }
    }

    public int pop() {
        return this.stack2.pop();
    }

    public int peek() {
        return this.stack2.peek();
    }

    public boolean empty() {
        return this.stack2.isEmpty();
    }
}

public class Leetcode232 {
    public static void main(String[] args) {

    }
}
