class Stack<T> {
    private items: T[] = [];

    isEmpty(): boolean {
        return this.items.length === 0;
    }

    push(elm: T): void {
        this.items.push(elm);
    }

    pop(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        } else {
            return this.items.pop();
        }
    }

    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        } else {
            return this.items[this.items.length - 1];
        }
    }
}

function finalPrices(prices: number[]): number[] {
    let stack: Stack<number> = new Stack<number>();
    let result: number[] = [];
    for (let i: number = 0; i < prices.length; i++) {
        while (!stack.isEmpty() && prices[stack.peek()!] >= prices[i]) {
            let idx: number = stack.pop() as number;
            result[idx] = prices[idx] - prices[i];
        }
        stack.push(i);
    }
    while (!stack.isEmpty()) {
        let idx: number = stack.pop() as number;
        result[idx] = prices[idx];
    }
    return result;
};

let prices: number[] = [8, 4, 6, 2, 3];
console.log(finalPrices(prices));

export { };