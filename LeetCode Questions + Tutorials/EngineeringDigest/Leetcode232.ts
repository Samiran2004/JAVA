class Stack<T> {
    private items: T[] = [];

    isEmpty(): boolean {
        return this.items.length === 0;
    }

    add(elm: T | undefined): void {
        this.items.push(elm as T);
    }

    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is Empty.");
        } else {
            return this.items[this.items.length - 1];
        }
    }

    pop(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        } else {
            return this.items.pop();
        }
    }
}

class MyQueue {
    stack1: Stack<number>;
    stack2: Stack<number>;

    constructor() {
        this.stack1 = new Stack<number>();
        this.stack2 = new Stack<number>();
    }

    push(x: number): void {
        if (this.stack2.isEmpty()) {
            this.stack2.add(x);
        } else {
            while (!this.stack2.isEmpty()) {
                this.stack1.add(this.stack2.pop());
            }
            this.stack2.add(x);
            while (!this.stack1.isEmpty()) {
                this.stack2.add(this.stack1.pop());
            }
        }
    }

    pop(): number {
        return this.stack2.pop() as number;
    }

    peek(): number {
        return this.stack2.peek() as number;
    }

    empty(): boolean {
        return this.stack2.isEmpty();
    }
}