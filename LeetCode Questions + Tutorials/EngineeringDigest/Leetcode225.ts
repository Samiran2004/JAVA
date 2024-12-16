class CustomQueue<T> {
    private items: T[] = [];

    isEmpty(): boolean {
        return this.items.length === 0;
    }

    add(elm: T | undefined): void {
        this.items.push(elm as T);
    }

    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Queue is empty.");
        } else {
            return this.items[0];
        }
    }

    poll(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Queue is empty.");
        } else {
            let pollElm: number = this.items[0] as number;
            // for (let i: number = 0; i < this.items.length - 1; i++) {
            //     this.items[i] = this.items[i + 1];
            // }
            // this.items.length = this.items.length - 1;
            this.items.splice(0, 1);
            return pollElm as T;
        }
    }
}

class MyStack {
    queue1: CustomQueue<number>;
    queue2: CustomQueue<number>;

    constructor() {
        this.queue1 = new CustomQueue<number>();
        this.queue2 = new CustomQueue<number>();
    }

    push(x: number): void {
        while (!this.queue2.isEmpty()) {
            this.queue1.add(this.queue2.poll());
        }
        this.queue2.add(x);
        while (!this.queue1.isEmpty()) {
            this.queue2.add(this.queue1.poll());
        }
    }

    pop(): number {
        return this.queue2.poll() as number;
    }

    top(): number {
        return this.queue2.peek() as number;
    }

    empty(): boolean {
        return this.queue2.isEmpty();
    }
}

export { };